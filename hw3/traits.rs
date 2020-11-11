pub struct ChessPiece {
    pub name: String,
    pub action: String,
    pub color: String,
}

pub struct PlayingCard {
    pub suit: String,
    pub value: String,
}

pub trait Summary {
    fn what_am_i(&self) -> String;
}

impl Summary for ChessPiece {
    fn what_am_i(&self) -> String {
        format!("{} {}", self.color, self.name)
    }
}

impl Summary for PlayingCard {
    fn what_am_i(&self) -> String {
        format!("{} of {}", self.value, self.suit)
    }
}

fn main() {
    let c = ChessPiece {
        name: String::from("Rook"),
        action: String::from("Moves horizontally or vertically"),
        color: String::from("Black"),
    };
    
    let p = PlayingCard {
        suit: String::from("Hearts"),
        value: String::from("Ace"),
    };
    
    println!("Last piece: {}", c.what_am_i());
    println!("You hold a {}", p.what_am_i());
}