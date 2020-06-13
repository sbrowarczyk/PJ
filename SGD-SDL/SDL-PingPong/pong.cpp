#include "pong.h"

// stworzenie okna gry
Pong::Pong() : m_left_paddle(Paddle::Type::LEFT, 0, (400 / 2) - 50), m_right_paddle(Paddle::Type::RIGHT, 400 - 50, (400 / 2) - 50) 
{
	const int WINDOW_WIDTH = 640;
	const int WINDOW_HEIGHT = 480;
	const int GAME_WIDTH = 400;
	const int GAME_HEIGHT = 400;

	SDL_CreateWindowAndRenderer(WINDOW_WIDTH, WINDOW_HEIGHT, SDL_WINDOW_RESIZABLE, &m_game_window, &m_game_window_renderer);
	SDL_RenderSetLogicalSize(m_game_window_renderer, GAME_WIDTH, GAME_HEIGHT);
	m_ball.init(m_game_window_renderer, GAME_WIDTH, GAME_HEIGHT);
}	


void Pong::game_loop()
{

	bool keep_running = true;
	while (keep_running)
	{
		while (SDL_PollEvent(&m_game_window_event) > 0)
		{
			switch (m_game_window_event.type)
			{
			case SDL_QUIT:
				keep_running = false;
			}

			m_left_paddle.handle_input(m_game_window_event);
			m_right_paddle.handle_input(m_game_window_event);

		}

		update(1.0 / 60.0);	// 60fps
		draw();
	}
}



void Pong::update(double delta_time)
{
	m_left_paddle.update(delta_time);
	m_right_paddle.update(delta_time);
	m_ball.update(delta_time);
}

void Pong::draw()
{
	SDL_RenderClear(m_game_window_renderer);

	m_left_paddle.draw(m_game_window_renderer);
	m_right_paddle.draw(m_game_window_renderer);
	m_ball.draw(m_game_window_renderer);

	SDL_RenderPresent(m_game_window_renderer);
}