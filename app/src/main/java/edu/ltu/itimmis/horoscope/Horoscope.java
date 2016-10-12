package edu.ltu.itimmis.horoscope;

/**
 * Horoscope class
 * Created by itimmis on 10/6/2016.
 */
public class Horoscope
{
    String name;
    String description;

    String month;
    String horoscope;
    String symbol;

    public static final Horoscope[] horoscopes = {
             new Horoscope("Aries",
                    "They are continuously looking for dynamic, speed and competition.",
                    "Ram",
                    "March 21 - April 19",
                    "Your favorite T-shirt brings about your downfall when a literal-minded mob follows its instructions and fills you to the indicated line with margaritas."),
            new Horoscope("Taurus",
                    "Taurus is the first when it comes to harvesting the fruits of his labor.",
                    "Bull",
                    "April 20 - May 20",
                    "Many have felt the Love Which Dare Not Speak Its Name, but you’ll experience the Love That Bellows Its Name Out A Crosstown-Bus Window All Day."),
            new Horoscope("Gemini",
                    "Gemini represents two different sides of personality and you will never be sure with whom you will face.",
                    "Twins",
                    "May 21 - June 20",
                    "Once again, the specter of war will dominate international news, preventing people the world over from learning how you made the world’s largest apple pie."),
            new Horoscope("Cancer",
                    "Cancer can be one of the most challenging Zodiac signs to get to know.",
                    "Crab",
                    "June 21 - July 22",
                    "Your problem is that you have no sense of proportion, which is why you paid surgeons to enlarge your head and hands."),
            new Horoscope("Leo",
                    "People born under the sign of Leo are natural born leaders.",
                    "Lion",
                    "July 23 - August 22",
                    "Some people believe your house in Heaven is filled with all the things you lost while on earth, which explains the dead pets lying everywhere."),
            new Horoscope("Virgo",
                    "Virgos are always paying attention to smallest details and their deep sense of humanity makes them one of the most careful signs of the zodiac.",
                    "Maiden",
                    "August 23 – September 22",
                    "That run for the record books once again falls short when you start Boston’s all-time second-largest fire."),
            new Horoscope("Libra",
                    "People born under the sign of Libra are peaceful and fair,",
                    "Scales",
                    "September 23 - October 22",
                    "Next time, when passing a note intended to find out if someone likes you, you’ll know to provide more than one box to check."),
            new Horoscope("Scorpio",
                    "Scorpio is a great leader, always aware of the situation and also features prominently in resourcefulness.",
                    "Scorpion",
                    "October 23 - November 21",
                    "The story of the universe has always fascinated you, but the ending will leave you with a lot of unanswered questions."),
            new Horoscope("Sagittarius",
                    "Sagittarius is extrovert, optimistic and enthusiastic, and likes changes.",
                    "Archer",
                    "November 22 - December 21",
                    "You’ll never smile again after the tragic loss of your lower jaw and lips this week."),
            new Horoscope("Capricorn",
                    "Capricorn is practical and is considered to be the most serious sign of the zodiac, who possess an independence that enables significant progress both on the personal level and in business.",
                    "Sea-Goat",
                    "December 22 - January 19",
                    "As it turns out, there are indeed mountains high enough and valleys low enough to keep you from your love."),
            new Horoscope("Aquarius",
                    "Aquarius-born are shy and quiet , but on the other hand they can be eccentric and energetic.",
                    "Water-Bearer",
                    "January 20 - February 18",
                    "The stars wouldn’t take the risks you do, but, hey, it’s your life for the next six months or so."),
            new Horoscope("Pisces",
                    "Pisces are very friendly, so they often find themselves in a company of very different people.",
                    "Fish",
                    "February 19 - March 20",
                    "You’ll be trapped in a hell of your own making, forcing you to admit that you really should have put in more bathrooms.")
    };

    private Horoscope(String name, String description, String symbol, String month, String horoscope) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.month = month;
        this.horoscope = horoscope;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String getMonth() {return month; }
    public String getHoroscope() { return horoscope; }
    public String getSymbol() { return symbol; }

    public String toString() {
        return this.name;
    }
}
