import java.util.*;

public class Categories {
    private static List<String> NFLSkillPostion;
    private static List<String> ModernNFL;
    private static List<String> ModernNHL;
    private static List<String> AllTimeNHL;

    public Categories() {
        NFLSkillPostion = new ArrayList<>();
        ModernNFL = new ArrayList<>();
        ModernNHL = new ArrayList<>();
        AllTimeNHL = new ArrayList<>();
    }

    public static List<String> selectCategory(String category) {
        switch (category) {
            case "NFL Skill Postions":
                initNFLSkillPostion();
                return  NFLSkillPostion;

            case "Modern NFL":
                initModernNFL();
                return  ModernNFL;

            case "Modern NHL":
                initModernNHL();
                return  ModernNHL;

            case "All Time NHL":
                initAllTimeNHL();
                return  AllTimeNHL;

            default:
                return null;
        }
    }

    public static void initNFLSkillPostion() {
        NFLSkillPostion = Arrays.asList(
                // Quarterbacks - Updated for 2025
                "Patrick Mahomes", "Josh Allen", "Joe Burrow", "Lamar Jackson", "Justin Herbert",
                "C.J. Stroud", "Trevor Lawrence", "Anthony Richardson", "Tua Tagovailoa", "Will Levis",
                "Bryce Young", "Jalen Hurts", "Dak Prescott", "Jordan Love", "Kyler Murray",
                "Brock Purdy", "Matthew Stafford", "Jared Goff", "Kirk Cousins", "Geno Smith",
                "Daniel Jones", "Caleb Williams", "Drake Maye", "Jayden Daniels",

                // Running Backs - Updated for 2025
                "Christian McCaffrey", "Bijan Robinson", "Jahmyr Gibbs", "Saquon Barkley", "Travis Etienne",
                "Jonathan Taylor", "Nick Chubb", "Josh Jacobs", "Derrick Henry", "Tony Pollard",
                "Rhamondre Stevenson", "James Cook", "Kenneth Walker", "Javonte Williams", "Isiah Pacheco",
                "Rachaad White", "D'Andre Swift", "Aaron Jones", "Joe Mixon", "David Montgomery",
                "Alvin Kamara", "De'Von Achane", "James Conner", "Brian Robinson", "Dameon Pierce",
                "Tyjae Spears", "Zamir White", "Jaylen Warren", "Jerome Ford", "Tank Bigsby",
                "Roschon Johnson", "Kendre Miller", "Zach Charbonnet", "Tyler Allgeier", "Elijah Mitchell",
                "Kyren Williams", "Chase Brown", "Keaton Mitchell", "Eric Gray", "Deuce Vaughn",
                "Jaleel McLaughlin", "Emanuel Wilson",

                // Wide Receivers - Updated for 2025
                "Justin Jefferson", "Ja'Marr Chase", "CeeDee Lamb", "Amon-Ra St. Brown", "A.J. Brown",
                "Tyreek Hill", "Stefon Diggs", "Davante Adams", "Garrett Wilson", "Jaylen Waddle",
                "Chris Olave", "DeVonta Smith", "Brandon Aiyuk", "DK Metcalf", "Tee Higgins",
                "Michael Pittman", "Drake London", "Christian Kirk", "Calvin Ridley", "Deebo Samuel",
                "Terry McLaurin", "Mike Evans", "Keenan Allen", "DJ Moore", "Chris Godwin",
                "Jordan Addison", "Zay Flowers", "Jaxon Smith-Njigba", "Rashee Rice", "Josh Downs",
                "Tank Dell", "Christian Watson", "George Pickens", "Jerry Jeudy", "Diontae Johnson",
                "Jameson Williams", "Kadarius Toney", "Skyy Moore", "Wan'Dale Robinson", "Rashid Shaheed",
                "Jonathan Mingo", "Jayden Reed", "Marvin Mims", "Quentin Johnston", "Joshua Palmer",
                "Alec Pierce", "Romeo Doubs", "Khalil Shakir", "Jahan Dotson", "Elijah Moore",
                "Nico Collins", "Jakobi Meyers", "Courtland Sutton", "Marquise Brown", "Brandin Cooks",
                "Adam Thielen", "Michael Thomas", "Darnell Mooney", "Allen Lazard", "Hunter Renfrow",
                "Van Jefferson", "K.J. Osborn", "Donovan Peoples-Jones", "Ray-Ray McCloud", "DeAndre Hopkins",

                // Tight Ends - Updated for 2025
                "Travis Kelce", "Mark Andrews", "George Kittle", "Sam LaPorta", "T.J. Hockenson",
                "Kyle Pitts", "Dalton Kincaid", "Evan Engram", "David Njoku", "Dallas Goedert",
                "Cole Kmet", "Pat Freiermuth", "Tyler Higbee", "Gerald Everett", "Dalton Schultz",
                "Noah Fant", "Mike Gesicki", "Juwan Johnson", "Logan Thomas", "Hunter Henry",
                "Isaiah Likely", "Luke Musgrave", "Michael Mayer", "Brenton Strange", "Tucker Kraft");
    }

    public static void initModernNFL() {
        ModernNFL = Arrays.asList(
                // Quarterbacks (35)
                "Patrick Mahomes", "Josh Allen", "Joe Burrow", "Lamar Jackson", "Justin Herbert",
                "C.J. Stroud", "Trevor Lawrence", "Anthony Richardson", "Tua Tagovailoa", "Will Levis",
                "Bryce Young", "Jalen Hurts", "Dak Prescott", "Jordan Love", "Kyler Murray",
                "Brock Purdy", "Matthew Stafford", "Jared Goff", "Kirk Cousins", "Geno Smith",
                "Daniel Jones", "Caleb Williams", "Drake Maye", "Jayden Daniels", "Kenny Pickett",
                "Mac Jones", "Desmond Ridder", "Sam Howell", "Aidan O'Connell", "Jake Browning",
                "Dorian Thompson-Robinson", "Easton Stick", "Tanner McKee", "Stetson Bennett", "Malik Willis",

                // Running Backs (40)
                "Christian McCaffrey", "Bijan Robinson", "Jahmyr Gibbs", "Saquon Barkley", "Travis Etienne",
                "Jonathan Taylor", "Nick Chubb", "Josh Jacobs", "Derrick Henry", "Tony Pollard",
                "Rhamondre Stevenson", "James Cook", "Kenneth Walker", "Javonte Williams", "Isiah Pacheco",
                "Rachaad White", "D'Andre Swift", "Aaron Jones", "Joe Mixon", "David Montgomery",
                "Alvin Kamara", "De'Von Achane", "James Conner", "Brian Robinson", "Dameon Pierce",
                "Tyjae Spears", "Zamir White", "Jaylen Warren", "Jerome Ford", "Tank Bigsby",
                "Roschon Johnson", "Kendre Miller", "Zach Charbonnet", "Tyler Allgeier", "Elijah Mitchell",
                "Kyren Williams", "Chase Brown", "Keaton Mitchell", "Eric Gray", "Deuce Vaughn",

                // Wide Receivers (70)
                "Justin Jefferson", "Ja'Marr Chase", "CeeDee Lamb", "Amon-Ra St. Brown", "A.J. Brown",
                "Tyreek Hill", "Stefon Diggs", "Davante Adams", "Garrett Wilson", "Jaylen Waddle",
                "Chris Olave", "DeVonta Smith", "Brandon Aiyuk", "DK Metcalf", "Tee Higgins",
                "Michael Pittman", "Drake London", "Christian Kirk", "Calvin Ridley", "Deebo Samuel",
                "Terry McLaurin", "Mike Evans", "Keenan Allen", "DJ Moore", "Chris Godwin",
                "Jordan Addison", "Zay Flowers", "Jaxon Smith-Njigba", "Rashee Rice", "Josh Downs",
                "Tank Dell", "Christian Watson", "George Pickens", "Jerry Jeudy", "Diontae Johnson",
                "Jameson Williams", "Kadarius Toney", "Skyy Moore", "Wan'Dale Robinson", "Rashid Shaheed",
                "Jonathan Mingo", "Jayden Reed", "Marvin Mims", "Quentin Johnston", "Joshua Palmer",
                "Alec Pierce", "Romeo Doubs", "Khalil Shakir", "Jahan Dotson", "Elijah Moore",
                "Nico Collins", "Jakobi Meyers", "Courtland Sutton", "Marquise Brown", "Brandin Cooks",
                "Adam Thielen", "Michael Thomas", "Darnell Mooney", "Allen Lazard", "Hunter Renfrow",
                "Van Jefferson", "K.J. Osborn", "Donovan Peoples-Jones", "Ray-Ray McCloud", "DeAndre Hopkins",
                "Rome Odunze", "Malik Nabers", "Brian Thomas Jr.", "Xavier Worthy", "Ladd McConkey",
                "Adonai Mitchell", "Troy Franklin", "Keon Coleman", "Xavier Legette",

                // Tight Ends (30)
                "Travis Kelce", "Mark Andrews", "George Kittle", "Sam LaPorta", "T.J. Hockenson",
                "Kyle Pitts", "Dalton Kincaid", "Evan Engram", "David Njoku", "Dallas Goedert",
                "Cole Kmet", "Pat Freiermuth", "Tyler Higbee", "Gerald Everett", "Dalton Schultz",
                "Noah Fant", "Mike Gesicki", "Juwan Johnson", "Logan Thomas", "Hunter Henry",
                "Isaiah Likely", "Luke Musgrave", "Michael Mayer", "Brenton Strange", "Tucker Kraft",
                "Cade Otton", "Greg Dulcich", "Chigoziem Okonkwo", "Daniel Bellinger", "Will Mallory",

                // Kickers (25)
                "Justin Tucker", "Harrison Butker", "Younghoe Koo", "Daniel Carlson", "Evan McPherson",
                "Tyler Bass", "Jason Myers", "Jake Elliott", "Brandon Aubrey", "Greg Zuerlein",
                "Matt Gay", "Blake Grupe", "Cameron Dicker", "Anders Carlson", "Eddy Pineiro",
                "Chase McLaughlin", "Jake Moody", "Brandon McManus", "Wil Lutz", "Graham Gano",
                "Chris Boswell", "Nick Folk", "Dustin Hopkins", "Riley Patterson", "Cairo Santos",

                // Defensive Linemen (20)
                "Aaron Donald", "Chris Jones", "Micah Parsons", "Myles Garrett", "Nick Bosa",
                "T.J. Watt", "Maxx Crosby", "Aidan Hutchinson", "Trey Hendrickson", "Haason Reddick",
                "Quinnen Williams", "Jeffery Simmons", "Derrick Brown", "DeForest Buckner", "Jonathan Allen",
                "Cameron Heyward", "Kenny Clark", "Vita Vea", "Dexter Lawrence", "Javon Hargrave",

                // Linebackers (20)
                "Fred Warner", "Roquan Smith", "Bobby Wagner", "Dre Greenlaw", "Demario Davis",
                "Lavonte David", "Shaquille Leonard", "Tremaine Edmunds", "Jordyn Brooks", "Devin White",
                "Zaire Franklin", "Alex Anzalone", "Josey Jewell", "Frankie Luvu", "Kyzir White",
                "Nicholas Morrow", "Christian Harris", "Jack Campbell", "Trenton Simpson", "Daiyan Henley",

                // Cornerbacks (20)
                "Sauce Gardner", "Jaire Alexander", "Patrick Surtain II", "Denzel Ward", "Marlon Humphrey",
                "Jaycee Horn", "Trevon Diggs", "Darius Slay", "Marshon Lattimore", "Charvarius Ward",
                "L'Jarius Sneed", "Kenny Moore II", "Tariq Woolen", "Devon Witherspoon", "Christian Gonzalez",
                "Joey Porter Jr.", "Emmanuel Forbes", "Deonte Banks", "Jaylon Johnson", "Steven Nelson",

                // Safeties (20)
                "Minkah Fitzpatrick", "Derwin James", "Justin Simmons", "Kevin Byard", "Budda Baker",
                "Jessie Bates III", "Antoine Winfield Jr.", "Jevon Holland", "Kyle Hamilton", "Talanoa Hufanga",
                "Jordan Poyer", "Micah Hyde", "Xavier McKinney", "Jaquan Brisker", "Kerby Joseph",
                "Jalen Pitre", "Nick Cross", "Brian Branch", "Sydney Brown", "Jason Pinnock"
        );
    }

    public static void initModernNHL() {
        ModernNHL = Arrays.asList(
                // Superstars & Franchise Players
                "Connor McDavid", "Auston Matthews", "Nathan MacKinnon", "Leon Draisaitl",
                "Cale Makar", "David Pastrnak", "Nikita Kucherov", "Jack Hughes",
                "Jason Robertson", "Mikko Rantanen", "Matthew Tkachuk", "Brady Tkachuk",
                "Sidney Crosby", "Alex Ovechkin", "Elias Pettersson", "Mitch Marner",

                // Rising Young Stars
                "Connor Bedard", "Matvei Michkov", "Luke Hughes", "Simon Nemec",
                "Logan Cooley", "Leo Carlsson", "Adam Fantilli", "Cole Caufield",
                "Mason McTavish", "Juraj Slafkovsky", "Shane Wright", "Dylan Holloway",

                // Elite Forwards
                "William Nylander", "J.T. Miller", "Steven Stamkos", "Brayden Point",
                "Kyle Connor", "Jake Guentzel", "Mark Scheifele", "John Tavares",
                "Anze Kopitar", "Jonathan Huberdeau", "Johnny Gaudreau", "Patrik Laine",
                "Timo Meier", "Clayton Keller", "Jesper Bratt", "Roope Hintz",

                // Top Defensemen
                "Quinn Hughes", "Adam Fox", "Victor Hedman", "Roman Josi",
                "Miro Heiskanen", "Charlie McAvoy", "Devon Toews", "Evan Bouchard",
                "Noah Dobson", "Josh Morrissey", "Moritz Seider", "Rasmus Dahlin",
                "K'Andre Miller", "Jake Sanderson", "Owen Power", "Brandon Montour",

                // Elite Goaltenders
                "Igor Shesterkin", "Andrei Vasilevskiy", "Ilya Sorokin", "Jake Oettinger",
                "Jeremy Swayman", "Thatcher Demko", "Connor Hellebuyck", "Juuse Saros",
                "Filip Gustavsson", "Stuart Skinner", "Alexandar Georgiev", "Carter Hart",

                // Two-Way Forwards
                "Aleksander Barkov", "Sebastian Aho", "Mathew Barzal", "Jack Eichel",
                "Ryan O'Reilly", "Mika Zibanejad", "Bo Horvat", "Nico Hischier",
                "Dylan Larkin", "Pierre-Luc Dubois", "Robert Thomas", "Jordan Kyrou",

                // Power Forwards & Snipers
                "Zach Hyman", "Valeri Nichushkin", "Tom Wilson", "Kirill Kaprizov",
                "Artemi Panarin", "Filip Forsberg", "Travis Konecny", "Alex DeBrincat",
                "Kevin Fiala", "Troy Terry", "Joel Eriksson Ek", "Pavel Buchnevich",

                // Young Emerging Talent
                "Matt Boldy", "Dawson Mercer", "Cole Perfetti", "Kent Johnson",
                "Marco Rossi", "Peyton Krebs", "William Eklund", "Philip Broberg",
                "Simon Edvinsson", "Brandt Clarke", "Kevin Korchinski", "David Jiricek",

                // Veteran Leaders
                "Patrice Bergeron", "Drew Doughty", "Mark Stone", "Joe Pavelski",
                "Brent Burns", "Erik Karlsson", "Jonathan Quick", "Jeff Petry",

                // Reliable Two-Way Players
                "Jaccob Slavin", "Jonas Brodin", "Ryan Lindgren", "Yanni Gourde",
                "Blake Coleman", "Barclay Goodrow", "Chandler Stephenson", "Nicholas Paul",

                // Offensive Defensemen
                "Shea Theodore", "Tony DeAngelo", "John Klingberg", "Tyson Barrie",
                "Samuel Girard", "Mike Matheson", "Cam Fowler", "Vince Dunn",

                // Solid Goaltenders
                "Linus Ullmark", "Cam Talbot", "Vitek Vanecek", "Pheonix Copley",
                "Charlie Lindgren", "Dan Vladar", "Antti Raanta", "Martin Jones"
        );
    }

    public static void initAllTimeNHL() {
        AllTimeNHL = Arrays.asList(
                // The Absolute Legends
                "Wayne Gretzky", "Mario Lemieux", "Bobby Orr", "Gordie Howe",

                // All-Time Great Forwards
                "Sidney Crosby", "Alex Ovechkin", "Jaromir Jagr", "Mark Messier",
                "Steve Yzerman", "Joe Sakic", "Maurice Richard", "Jean Beliveau",
                "Guy Lafleur", "Mike Bossy", "Phil Esposito", "Brett Hull",
                "Teemu Selanne", "Stan Mikita", "Bobby Hull", "Peter Forsberg",
                "Eric Lindros", "Paul Kariya", "Pat LaFontaine", "Dale Hawerchuk",
                "Marcel Dionne", "Gilbert Perreault", "Bryan Trottier", "Denis Savard",
                "Ron Francis", "Mike Modano", "Joe Thornton", "Patrick Kane",
                "Evgeni Malkin", "Steven Stamkos", "Connor McDavid", "Auston Matthews",
                "Nathan MacKinnon", "Leon Draisaitl", "Jonathan Toews", "Anze Kopitar",
                "Henrik Lundqvist", "Martin St. Louis", "Brendan Shanahan", "Dany Heatley",
                "Ilya Kovalchuk", "Pavel Bure", "Sergei Fedorov", "Alexander Mogilny",
                "Pavel Datsyuk", "Henrik Zetterberg", "Daniel Sedin", "Henrik Sedin",
                "Mats Sundin", "Peter Bondra", "Keith Tkachuk", "Jeremy Roenick",

                // All-Time Great Defensemen
                "Nicklas Lidstrom", "Ray Bourque", "Larry Robinson", "Doug Harvey",
                "Denis Potvin", "Chris Chelios", "Scott Stevens", "Scott Niedermayer",
                "Al MacInnis", "Paul Coffey", "Brian Leetch", "Rod Langway",
                "Brad Park", "Sergei Zubov", "Chris Pronger", "Zdeno Chara",
                "Duncan Keith", "Mark Howe", "Pierre Pilote", "Tim Horton",
                "Cale Makar", "Victor Hedman", "Roman Josi", "Erik Karlsson",
                "Brent Burns", "Drew Doughty", "Adam Fox", "Quinn Hughes",
                "Red Kelly", "King Clancy", "Eddie Shore", "Bobby Baun",

                // All-Time Great Goaltenders
                "Martin Brodeur", "Patrick Roy", "Dominik Hasek", "Terry Sawchuk",
                "Jacques Plante", "Ken Dryden", "Grant Fuhr", "Tony Esposito",
                "Ed Belfour", "Roberto Luongo", "Carey Price", "Glenn Hall",
                "Billy Smith", "Bernie Parent", "Mike Richter", "Tom Barrasso",
                "Curtis Joseph", "Olaf Kolzig", "Pekka Rinne", "Henrik Lundqvist",
                "Marc-Andre Fleury", "Andrei Vasilevskiy", "Igor Shesterkin"
        );
    }
}
