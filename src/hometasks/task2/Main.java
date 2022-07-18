package hometasks.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String regex = "\\s[в|без|до|из|к|на|по|о|от|перед|при|через|с|у|и|нет|за|над|для|об|под|про]\\s";
        String str = "Преимущество таких строк заключается в том," +
                " что их очень удобно собирать из других строк и даже переменных любых типов," +
                " складывать между собой, делить на подстроки и так далее." +
                " String является динамическим объектом и при изменении длины " +
                " строки начинает менять своё место в оперативной памяти микроконтроллера," +
                " что требует относительно большого времени выполнения и может приводить к фрагментации памяти";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        String value = matcher.replaceAll(" Java ");
        System.out.println(value);


    }

}
