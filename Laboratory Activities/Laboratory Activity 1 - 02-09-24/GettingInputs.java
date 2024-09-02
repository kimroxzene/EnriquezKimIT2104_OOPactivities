import java.util.Scanner;

class GettingInputs{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

            System.out.print("Enter the year: ");
            int year = myObj.nextInt();
            myObj.nextLine();

            String genre, album, title, artist;

            System.out.print("Enter the genre: ");
            genre = myObj.nextLine();
            System.out.print("Enter the album: ");
            album = myObj.nextLine();
            System.out.print("Enter the song title: ");
            title = myObj.nextLine();
            System.out.print("Enter the artist: ");
            artist = myObj.nextLine();

            System.out.println("-----------------------\n SONG DETAILS \n----------------------");
            System.out.println("Year Released: " + year);
            System.out.println("Genre: " + genre);
            System.out.println("Album: " + album);
            System.out.println("Title: " + "\""+ title + "\"");
            System.out.println("Artist: " + artist);

            myObj.close();
        }
    }
