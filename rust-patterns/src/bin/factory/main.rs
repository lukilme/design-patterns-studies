mod src;  // Import the `factory` module

use src::game;
use src::magic_maze::MagicMaze;
use src::ordinary_maze::OrdinaryMaze;

fn main() {
    let ordinary_maze = OrdinaryMaze::new();
    game::run(ordinary_maze);

    let magic_maze = MagicMaze::new();
    game::run(magic_maze);
}