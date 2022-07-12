package president.example.ikeak.presidentsquiz;

/**
 * Created by ikeak on 8/9/2017.
 */
public class choices {


    public String mChoices[][] = {

            {"Barrack Obama", "Zachary Taylor", "George Washington", "John Kerry"},
            {"John Adams", "Abraham Lincoln", "Vladimir Putin", "John Kerry"},
            {"Barrack Obama", "Willam Taft", "JJ Abrams", "Thomas Jefferson"},
            {"Calvin Cooledge", "James Madison", "Riley dixon", "John Kerry"},
            {"James Monroe", "Robert E Lee", "Margaret thatcher", "John Quincy Adams"},
            {"James Simpson", " Bill Clinton", "James Monroe", "John Quincy Adams"},
            {"Andrew Jackson", "John Quincy", "Alexander Hamilton", "John Kerry"},
            {"Barrack Obama", "Winston Churchhill", "Aaron Burr", "Martin Van Buren"},
            {"William Henry Harrison", "Bill Clinton", "Hilary Clinton", "John Pence"},
            {"Richard Nixon", "John Tyler", "Ulysses S. Grant", "Newt Gingrich"},
            {"James Knox Polk", "Kevin James", "Robert Mugabe", "Nancy Pelosi"},
            {"Abraham Lincoln", "Mike Pence", "Zachary Taylor", "James Garfield"},
            {"Garland Johnson", "Bill Clinton", "Millard Fillmore", "John Sinclair"},
            {"John Riley", "Franklin Pierce", "Hilary Clinton", "Dan Quayle"},
            {"Bill Lambert Musgrave", "Rutherford B Hayes", "James Buchanan", "Arlen Specter"},
            {"Abraham Lincoln", "Bill Clinton", "John Mccain", "John Kerry"},
            {"Winston Churchhill", "Andrew Johnson", "Dick Durbin", "Joseph Stalin"},
            {"Richard Lugar", "Ulysses Grant", "Hilary Clinton", "Mike Pence"},
            {"Barrack Obama", "Bill Clinton", "Adam Simpson West", "Rutherford Birchard Hayes"},
            {"Ted Kennedy", "Benito Mussolini", "James Abram Garfield", "John Kerry"},
            {"Chester Alan Arthur", "Harry Truman", "Hilary Clinton", "John Kerry"},
            {"Barrack Obama", "Grover Cleveland", "Hilary Clinton", "Herbert Hoover"},
            {"Benjamin Harrison", "Bill Clinton", "Hilary Clinton", "John Kerry"},
            {"Barrack Obama", "Bill Clinton", "Grover Cleveland", "John Kerry"},
            {"William McKinley", "John Kerry", "Hilary Clinton", "Rutherford B Hayes"},
            {"Barrack Obama", "Theodore Roosevelt", "Hilary Clinton", "John Kerry"},
            {"Barrack Obama", "Bill Clinton", "Hilary Clinton", "William Howard Taft"},
            {"Woodrow Wilson", " Franklin Pierce", "Hilary Clinton", "John Kerry"},
            {"Barrack Obama", "Benjamin Arland Taft", "Warren Gamaliel Harding", "John Kerry"},
            {"Joe Biden", "Calvin Coolidge", "Hilary Clinton", "John Kerry"},
            {"Barrack Obama", "Ted Reece", "John C Riley", "Herbert Clark Hoover"},
            {"John Tyler", "Donald Trump", "Franklin Delano Roosevelt", "Bill Clinton"},
            {"Franklin Delano Roosevelt", "Bill Clinton", "Harry S. Truman", "Margaret Thatcher"},
            {"Grover Cleveland", "Harry S. Truman", "Dwight David Eisenhower", "John Kerry"},
            {"John Fitzgerald Kennedy", " Bill Clinton", "Henry Wallace", "Grant Simpson Riley"},
            {"Barrack Obama", " Bill Clinton", "Lyndon Baines Johnson", "John Kerry"},
            {"Richard Milhous Nixon", "Bill Clinton", "Hilary Clinton", "John Belcher"},
            {"Barrack Obama", "James Earl Carter, Jr.", "Gerald Rudolph Ford", "James Madison"},
            {"James Earl Carter, Jr.", "Bill Clinton", "John Calhoun", "John Kerry"},
            {"Cale Sanderson", "James arless Blake", "Johnson Wales", "Ronald Wilson Reagan"},
            {"Barrack Obama", "William Jefferson Clinton", "Hilary Clinton", "George Herbert Walker Bush"},
            {"William Jefferson Clinton", "Aaron Burr", "Robert levi Blake", "John Kerry"},
            {"John Tyler", "Abraham Lincoln", "George Walker Bush", "John Kerry"},
            {"Henry Ford", "Barrack Obama", "Hilary Clinton", "John Kerry"},
            {"George W Bush", "Donald Trump", "William Burr", "Dan Quayle"},

    };

    public String getChoices(int a, int b) {

        String choices = mChoices[a][b - 1];

        return choices;
    }
}

