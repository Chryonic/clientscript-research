/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class MultilanguageString {
    static MultilanguageString DEV_CONSOLE_WELCOME
            = (new MultilanguageString
            ("This is the developer console. To close, press the `, \u00b2 or \u00a7 keys on your keyboard.",
                    "Das ist die Entwicklerkonsole. Zum Schlie\u00dfen, die Tasten `, \u00b2 or \u00a7 dr\u00fccken.",
                    "Ceci est clearClip console de d\u00e9veloppement. Pour clearClip fermer, appuyez sur les touches `, \u00b2 ou \u00a7.",
                    "Este \u00e9 o painel de controle do desenvolvedor. Para fechar, pressione `, \u00b2 ou \u00a7."));
    private String[] strings;
    static MultilanguageString DEV_COMMAND_ERROR
            = (new MultilanguageString
            ("There was an error executing the command.",
                    "Es gab einen Fehler beim Ausf\u00fchren des Befehls.",
                    "Une erreur s'est produite lors de l'ex\u00e9cution de clearClip commande.",
                    "Houve um erro quando o comando foi executado."));
    static MultilanguageString UNKNOWN_DEVELOPER_CMD
            = new MultilanguageString("Unknown developer command: ", "Unbekannter Befehl: ",
            "Commande inconnue : ", "Comando desconhecido: ");
    static MultilanguageString CANCEL
            = new MultilanguageString("Cancel", "Abbrechen", "Annuler", "Cancelar");
    static MultilanguageString MEMBERS_OBJECT;
    static MultilanguageString DISCARD;
    static MultilanguageString DISCARD_DUPLICATE;
    static MultilanguageString TAKE;
    static MultilanguageString DROP;
    static MultilanguageString CONTINUE;
    static MultilanguageString FRIENDS_LIST_FULL;
    static MultilanguageString LOADING_PLEASE_WAIT;
    static MultilanguageString PROFILING;
    static MultilanguageString CONNECTION_LOST;
    static MultilanguageString ATTEMPT_RECONNECT;
    static MultilanguageString CHECKING_FOR_UPDATES;
    static MultilanguageString FETCHING_UPDATES;
    static MultilanguageString LOADING;
    static MultilanguageString HAS_LOGGED_IN;
    static MultilanguageString HAS_LOGGED_OUT;
    static MultilanguageString UNABLE_TO_FIND;
    static MultilanguageString EXAMINE;
    static MultilanguageString ATTACK;
    static MultilanguageString CHOOSE_OPTION;
    static MultilanguageString MORE_OPTIONS;
    static MultilanguageString WALK_HERE;
    static MultilanguageString FACE_HERE;
    static MultilanguageString LEVEL;
    static MultilanguageString SKILL;
    static MultilanguageString RATING;
    static MultilanguageString PLEASE_WAIT;
    static MultilanguageString SPACE_OR_COLON;
    static MultilanguageString MILLION_SUFFIX;
    static MultilanguageString MILLION_SUFFIX_DUPLICATE;
    static MultilanguageString KILO_SUFFIX;
    static MultilanguageString KILO_SUFFIX_DUPLICATE;
    static MultilanguageString SELF;
    static MultilanguageString ALREADY_FRIENDS;
    static MultilanguageString IGNORE_LIST_FULL;
    static MultilanguageString ALREADY_IGNORED;
    static MultilanguageString CANT_FRIEND_SELF;
    static MultilanguageString CANT_IGNORE_SELF;
    static MultilanguageString FRIEND_IGNORE_PT1;
    static MultilanguageString FRIEND_IGNORE_PT2;
    static MultilanguageString IGNORE_ON_FRIEND_PT1;
    static MultilanguageString IGNORE_ON_FRIEND_PT2;
    static MultilanguageString YELLOW_CHATCOLOUR;
    static MultilanguageString RED_CHATCOLOUR;
    static MultilanguageString GREEN_CHATCOLOUR;
    static MultilanguageString CYAN_CHATCOLOUR;
    static MultilanguageString PURPLE_CHATCOLOUR;
    static MultilanguageString WHITE_CHATCOLOUR;
    static MultilanguageString FLASH1_CHATEFFECT;
    static MultilanguageString FLASH2_CHATEFFECT;
    static MultilanguageString FLASH3_CHATEFFECT;
    static MultilanguageString GLOW1_CHATEFFECT;
    static MultilanguageString GLOW2_CHATEFFECT;
    static MultilanguageString GLOW3_CHATEFFECT;
    static MultilanguageString WAVE_CHATEFFECT;
    static MultilanguageString WAVE2_CHATEFFECT;
    static MultilanguageString SHAKE_CHATEFFECT;
    static MultilanguageString SCROLL_CHATEFFECT;
    static MultilanguageString SLIDE_CHATEFFECT;
    static int[] anIntArray2863;
    static RsInterface aRsInterface_2865;
    static Class146 aClass146_2866;

    final String getLocalizedString(int argument_1_) {
        return strings[argument_1_];
    }

    public static void cleanConstants(int argument) {
        WALK_HERE = null;
        IGNORE_LIST_FULL = null;
        LOADING = null;
        HAS_LOGGED_OUT = null;
        aClass146_2866 = null;
        ALREADY_FRIENDS = null;
        ATTACK = null;
        FLASH1_CHATEFFECT = null;
        EXAMINE = null;
        WAVE2_CHATEFFECT = null;
        FRIENDS_LIST_FULL = null;
        SCROLL_CHATEFFECT = null;
        CYAN_CHATCOLOUR = null;
        UNKNOWN_DEVELOPER_CMD = null;
        HAS_LOGGED_IN = null;
        CONNECTION_LOST = null;
        IGNORE_ON_FRIEND_PT1 = null;
        RATING = null;
        DEV_COMMAND_ERROR = null;
        RED_CHATCOLOUR = null;
        CONTINUE = null;
        aRsInterface_2865 = null;
        FRIEND_IGNORE_PT1 = null;
        UNABLE_TO_FIND = null;
        IGNORE_ON_FRIEND_PT2 = null;
        CHOOSE_OPTION = null;
        SLIDE_CHATEFFECT = null;
        SPACE_OR_COLON = null;
        CANCEL = null;
        ALREADY_IGNORED = null;
        WAVE_CHATEFFECT = null;
        DROP = null;
        MILLION_SUFFIX = null;
        WHITE_CHATCOLOUR = null;
        FRIEND_IGNORE_PT2 = null;
        MILLION_SUFFIX_DUPLICATE = null;
        SHAKE_CHATEFFECT = null;
        GLOW1_CHATEFFECT = null;
        PROFILING = null;
        DISCARD = null;
        DISCARD_DUPLICATE = null;
        CANT_IGNORE_SELF = null;
        GLOW3_CHATEFFECT = null;
        Skybox.skyboxCache = null;
        LEVEL = null;
        MEMBERS_OBJECT = null;
        CHECKING_FOR_UPDATES = null;
        anIntArray2863 = null;
        YELLOW_CHATCOLOUR = null;
        SKILL = null;
        FACE_HERE = null;
        MORE_OPTIONS = null;
        KILO_SUFFIX_DUPLICATE = null;
        CANT_FRIEND_SELF = null;
        DEV_CONSOLE_WELCOME = null;
        ATTEMPT_RECONNECT = null;
        FLASH2_CHATEFFECT = null;
        SELF = null;
        FETCHING_UPDATES = null;
        PURPLE_CHATCOLOUR = null;
        KILO_SUFFIX = null;
        PLEASE_WAIT = null;
        FLASH3_CHATEFFECT = null;
        LOADING_PLEASE_WAIT = null;
        TAKE = null;
        GLOW2_CHATEFFECT = null;
        GREEN_CHATCOLOUR = null;
    }

    public final String toString() {
        return strings[0];
    }

    static final void method3778(int argument) {
        if (client.currentLoadingBar != null)
            client.currentLoadingBar.method2836();
        if (client.aThread3512 != null) {
            for (; ; ) {
                try {
                    client.aThread3512.join();
                    break;
                } catch (InterruptedException interruptedexception) {
                    /* empty */
                }
            }
        }
    }

    static final byte[] method3779(File argument, int argument_2_) {
        return DoublyLinkedNodeP2_Sub2_Sub3_Sub1.method1871(argument, (byte) -114, (int) argument.length());
    }

    private MultilanguageString(String argument_3_, String argument_4_,
                                String argument_5_, String argument_6_) {
        strings = new String[]{argument_3_, argument_4_, argument_5_, argument_6_};
    }

    static {
        new MultilanguageString("#Player", "#Spieler", "#Joueur", "#Jogador");
        MEMBERS_OBJECT
                = new MultilanguageString("Members object", "Gegenstand f\u00fcr Mitglieder",
                "Objet d'abonn\u00e9s", "Objeto para membros");
        new MultilanguageString
                ("Login to a members' server to use this object.",
                        "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
                        "Connectez-vous \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
                        "Acesse um servidor para membros para usar este objeto.");
        new MultilanguageString
                ("Swap this note at any bank for the equivalent item.",
                        "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.",
                        "\u00c9changez ce re\u00e7u contre l'objet correspondant dans clearClip banque de votre choix.",
                        "V\u00e1 a qualquer banco para trocar esta nota pelo objeto equivalente.");
        DISCARD
                = new MultilanguageString("Discard", "Ablegen", "Jeter", "Descartar");
        DISCARD_DUPLICATE
                = new MultilanguageString("Discard", "Ablegen", "Jeter", "Descartar");
        TAKE = new MultilanguageString("Take", "Nehmen", "Prendre", "Pegar");
        DROP
                = new MultilanguageString("Drop", "Fallen lassen", "Poser", "Largar");
        new MultilanguageString("Ok", "Okay", "OK", "Ok");
        new MultilanguageString("Select", "Ausw\u00e4hlen", "S\u00e9lectionner",
                "Selecionar");
        CONTINUE
                = new MultilanguageString("Continue", "Weiter", "Continuer", "Continuar");
        new MultilanguageString("Invalid player name.",
                "Unzul\u00e4ssiger Charaktername!",
                "Nom de joueur incorrect.",
                "Nome de jogador inv\u00e1lido.");
        new MultilanguageString("You can't report yourself!",
                "Du kannst dich nicht selbst melden!",
                "Vous ne pouvez pas vous signaler vous-m\u00eame !",
                "Voc\u00ea n\u00e3o pode denunciar a si pr\u00f3prio!");
        new MultilanguageString
                ("You already sent an abuse report under 60 secs ago! Do not abuse this system!",
                        "Du hast bereits vor weniger als 60 Sekunden einen Regelversto\u00df gemeldet!",
                        "Vous avez d\u00e9j\u00e0 signal\u00e9 un abus il y a moins d'une minute ! N'abusez pas du syst\u00e8me !",
                        "Voc\u00ea j\u00e1 enviou uma den\u00fancia de abuso h\u00e1 menos de um minuto. N\u00e3o abuse deste sistema!");
        new MultilanguageString(null, "Dieses System darf nicht missbraucht werden!",
                null, null);
        new MultilanguageString
                ("You cannot report that person for Staff Impersonation, they are Jagex Staff.",
                        "Diese Person ist ein Jagex-Mitarbeiter!",
                        "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas clearClip signaler pour abus d'identit\u00e9.",
                        "Voc\u00ea n\u00e3o pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        new MultilanguageString
                ("You can spot a Jagex moderator by the gold crown next to their name.",
                        "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.",
                        "Vous pouvez reconna\u00eetre les mod\u00e9rateurs Jagex \u00e0 clearClip couronne dor\u00e9e en regard de leur nom.",
                        "Os moderadores da Jagex s\u00e3o identificados por uma coroa dourada pr\u00f3xima ao \u007fnome.");
        new MultilanguageString
                ("You can report that person under a different rule.",
                        "Diese Person kann bez\u00fcglich einer anderen Regel gemeldet werden.",
                        "Vous pouvez signaler cette personne pour une autre infraction aux r\u00e8gles.",
                        "Voc\u00ea n\u00e3o pode denunciar essa pessoa de acordo com uma regra diferente.");
        new MultilanguageString("Thank-you, your abuse report has been received.",
                "Vielen Dank, deine Meldung ist bei uns eingegangen.",
                "Merci, nous avons bien re\u00e7u votre rapport d'abus.",
                "Obrigado. Sua den\u00fancia de abuso foi recebida.");
        new MultilanguageString
                ("Unable to send abuse report - system busy.",
                        "Meldung konnte nicht gesendet werden - Systeme \u00fcberlastet",
                        "Impossible de signaler un abus - Erreur syst\u00e8me",
                        "Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.");
        new MultilanguageString("Invalid name", "Unzul\u00e4ssiger Name!",
                "Nom incorrect", "Nome inv\u00e1lido");
        new MultilanguageString
                ("To use this item please login to a members' server.",
                        "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.",
                        "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.",
                        "Acesse um servidor para membros para usar este objeto.");
        new MultilanguageString
                ("To interact with this please login to a members' server.",
                        "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.",
                        "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour cette interaction.",
                        "Para interagir, acesse um servidor para membros.");
        new MultilanguageString("Nothing interesting happens.",
                "Nichts Interessantes passiert.",
                "Il ne se passe rien d'int\u00e9ressant.",
                "Nada de interessante acontece.");
        new MultilanguageString("You can't reach that.", "Da kommst du nicht hin.",
                "Vous ne pouvez pas l'atteindre.",
                "Voc\u00ea n\u00e3o consegue alcan\u00e7ar isso.");
        new MultilanguageString("Invalid teleport!", "Unzul\u00e4ssiger Teleport!",
                "T\u00e9l\u00e9portation non valide !",
                "Teleporte inv\u00e1lido!");
        new MultilanguageString
                ("To go here you must login to a members' server.",
                        "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.",
                        "Vous devez vous connecter \u00e0 un serveur d'abonn\u00e9s pour aller \u00e0 cet endroit.",
                        "Para entrar aqui, acesse um servidor para membros.");
        new MultilanguageString
                ("Unable to add friend - system busy.",
                        "Der Freund konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
                        "Impossible d'ajouter un ami - syst\u00e8me occup\u00e9.",
                        "N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.");
        new MultilanguageString
                ("Unable to add friend - unknown player.",
                        "Spieler konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
                        "Impossible d'ajouter l'ami - joueur inconnu.",
                        "N\u00e3o foi poss\u00edvel adicionar um amigo - jogador desconhecido.");
        new MultilanguageString
                ("Unable to add name - system busy.",
                        "Der Name konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.",
                        "Impossible d'ajouter un nom - syst\u00e8me occup\u00e9.",
                        "N\u00e3o foi poss\u00edvel adicionar o nome. O sistema est\u00e1 ocupado.");
        new MultilanguageString
                ("Unable to add name - unknown player.",
                        "Name konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.",
                        "Impossible d'ajouter le nom - joueur inconnu.",
                        "N\u00e3o foi poss\u00edvel adicionar um nome - jogador desconhecido.");
        FRIENDS_LIST_FULL
                = (new MultilanguageString
                ("Your friends list is full (200 names maximum)",
                        "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.",
                        "Votre liste d'amis est pleine (200 noms maximum).",
                        "Sua lista de amigos est\u00e1 cheia. O limite \u00e9 200."));
        new MultilanguageString
                ("Unable to delete friend - system busy.",
                        "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.",
                        "Impossible de supprimer un ami - syst\u00e8me occup\u00e9.",
                        "N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.");
        new MultilanguageString
                ("Unable to delete name - system busy.",
                        "Name konnte nicht gel\u00f6scht werden - Systemfehler.",
                        "Impossible d'effacer le nom - syst\u00e8me occup\u00e9.",
                        "N\u00e3o foi poss\u00edvel deletar o nome - sistema ocupado.");
        new MultilanguageString
                ("Unable to send message - system busy.",
                        "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.",
                        "Impossible d'envoyer un message - syst\u00e8me occup\u00e9.",
                        "N\u00e3o foi poss\u00edvel enviar a mensagem. O sistema est\u00e1 ocupado.");
        new MultilanguageString
                ("Unable to send message - player unavailable.",
                        "Deine Nachricht konnte nicht verschickt werden,",
                        "Impossible d'envoyer un message - joueur indisponible.",
                        "N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 dispon\u00edvel.");
        new MultilanguageString(null, "der Spieler ist momentan nicht verf\u00fcgbar.",
                null, null);
        new MultilanguageString
                ("Unable to send message - player not on your friends list.",
                        "Nachricht kann nicht geschickt werden,",
                        "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.",
                        "N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 getPixels sua lista de amigos.");
        new MultilanguageString(null, "Spieler nicht auf deiner Freunde-Liste.", null,
                null);
        new MultilanguageString
                ("You appear to be telling someone your password - please don't!",
                        "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das",
                        "Il semble que vous r\u00e9v\u00e9liez votre mot de passe \u00e0 quelqu'un - ne faites jamais \u00e7a !",
                        "Parece que voc\u00ea est\u00e1 revelando sua senha a algu\u00e9m. N\u00e3o drawCharacter2\u00e7a isso!");
        new MultilanguageString
                ("If you are not, please change your password to something more obscure!",
                        "nicht der Fall ist, \u00e4ndere dein Passwort zu einem ungew\u00f6hnlicheren Begriff!",
                        "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins \u00e9vidente !",
                        "Caso n\u00e3o esteja, altere sua senha para algo mais obscuro!");
        new MultilanguageString
                ("Unable to send message - set your display name first by logging into the game.",
                        "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ",
                        "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.",
                        "N\u00e3o \u00e9 poss\u00edvel enviar a mensagem. Defina um nome de personagem antes, fazendo login no jogo.");
        new MultilanguageString(null, "indem du dich ins Spiel einloggst.", null, null);
        new MultilanguageString
                ("For that rule you can only report players who have spoken or traded recently.",
                        "Mit dieser Option k\u00f6nnen nur Spieler gemeldet werden,",
                        "Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.",
                        "Para essa regra, voc\u00ea s\u00f3 pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        new MultilanguageString(null,
                "die k\u00fcrzlich gesprochen oder gehandelt haben.",
                null, null);
        new MultilanguageString
                ("That player is offline, or has privacy mode enabled.",
                        "Dieser Spieler ist offline oder hat den Privatsph\u00e4ren-Modus aktiviert.",
                        "Ce joueur est d\u00e9connect\u00e9 ou en mode priv\u00e9.",
                        "O jogador est\u00e1 offline ou est\u00e1 com o modo de privacidade ativado.");
        new MultilanguageString
                ("You cannot send a quick chat message to a player on this world at this time.",
                        "Einem Spieler auf dieser Welt k\u00f6nnen derzeit keine Direktchat-Nachrichten",
                        "Impossible d'envoyer un message rapide \u00e0 un joueur de ce serveur \u00e0 l'heure actuelle.",
                        "Voc\u00ea n\u00e3o pode enviar uma mensagem de papo r\u00e1pido para um jogador neste mundo neste momento.");
        new MultilanguageString(null, "geschickt werden.", null, null);
        new MultilanguageString
                ("This player is on a quick chat world and cannot receive your message.",
                        "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.",
                        "Ce joueur est sur un serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.",
                        "Este jogador n\u00e3o pode receber sua mensagem porque est\u00e1 em um mundo de papo r\u00e1pido.");
        new MultilanguageString("Chat disabled", "Deaktiviert",
                "Messagerie d\u00e9sactiv\u00e9e",
                "Bate-papo desativado");
        new MultilanguageString("friends_chat", "friends_chat", "friends_chat",
                "friends_chat");
        new MultilanguageString
                ("You are not currently in a friends chat channel.",
                        "Du befindest dich derzeit nicht in einem Freundes-Chatraum.",
                        "Vous ne faites pas partie d'un canal de discussion.",
                        "No momento, voc\u00ea n\u00e3o est\u00e1 no bate-papo entre amigos.");
        new MultilanguageString
                ("You are not allowed to talk in this friends chat channel.",
                        "Du darfst in diesem Freundes-Chatraum nicht reden.",
                        "Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de discussion.",
                        "Voc\u00ea pode falar neste bate-papo entre amigos.");
        new MultilanguageString
                ("Error sending message to friends chat - please try again later!",
                        "Fehler beim Versenden der Nachricht - bitte versuch es sp\u00e4ter erneut.",
                        "Erreur lors de l'envoi de ce message \u2013 veuillez r\u00e9essayer ult\u00e9rieurement !",
                        "Erro ao enviar mensagem para bate-papo entre amigos - favor tentar novamente mais tarde!");
        new MultilanguageString
                ("Please wait until you are logged out of your previous channel.",
                        "Bitte warte, bis du den vorherigen Chatraum verlassen hast.",
                        "Veuillez attendre d'\u00eatre d\u00e9connect\u00e9(e) de votre canal pr\u00e9c\u00e9dent.",
                        "Aguarde at\u00e9 se desconectar do canal anterior.");
        new MultilanguageString
                ("You are not currently in a channel.",
                        "Du befindest dich derzeit nicht in einem Chatraum.",
                        "Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.",
                        "No momento voc\u00ea n\u00e3o est\u00e1 em um canal.");
        new MultilanguageString("Attempting to join channel...",
                "Chatraum wird betreten...",
                "Tentative de connexion au canal...",
                "Tentando acessar canal...");
        new MultilanguageString("Sending request to leave channel...",
                "Chatraum wird verlassen...",
                "Envoi de clearClip demande de sortie du canal...",
                "Enviando solicita\u00e7\u00e3o para deixar o canal...");
        new MultilanguageString
                ("Already attempting to join a channel - please wait...",
                        "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.",
                        "Tentative de connexion au canal d\u00e9j\u00e0 en cours - veuillez patienter...",
                        "J\u00e1 h\u00e1 uma tentativa de entrar em um canal. Aguarde...");
        new MultilanguageString
                ("Leave request already in progress - please wait...",
                        "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.",
                        "Demande de sortie d\u00e9j\u00e0 effectu\u00e9e - veuillez patienter...",
                        "Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...");
        new MultilanguageString("Invalid channel name entered!",
                "Ung\u00fcltiger Chatraum-Name angegeben.",
                "Nom de canal incorrect !",
                "Nome de canal inv\u00e1lido!");
        new MultilanguageString
                ("Unable to join friends chat at this time - please try again later!",
                        "Freundes-Chatraum kann nicht betreten werden - bitte versuch es sp\u00e4ter erneut.",
                        "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez r\u00e9essayer ult\u00e9rieurement !",
                        "N\u00e3o foi poss\u00edvel participar do bate-papo entre amigos - favor tentar novamente mais tarde!");
        new MultilanguageString("Now talking in friends chat channel ",
                "Freundes-Chatraum: ",
                "Vous participez actuellement au canal de discussion : ",
                "Falando no momento no bate-papo entre amigos: ");
        new MultilanguageString
                ("Now talking in friends chat channel of player: ",
                        "Freundes-Chat dieses Spielers beigetreten: ",
                        "Vous participez actuellement au canal de discussion du joueur : ",
                        "Falando no momento no bate-papo entre amigos do jogador: ");
        new MultilanguageString
                ("To talk, start each line of chat with the / symbol.",
                        "Leite eine Zeile mit / ein, um hier zu chatten.",
                        "Pour parler, ins\u00e9rez le symbole / au d\u00e9but de chaque ligne.",
                        "Para falar, comece cada linha de conversa com o s\u00edmbolo /.");
        new MultilanguageString
                ("Error joining friends chat channel - please try again later!",
                        "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es sp\u00e4ter erneut.",
                        "Erreur lors de clearClip connexion au canal de discussion - veuillez r\u00e9essayer ult\u00e9rieurement !",
                        "Erro ao participar do bate-papo entre-amigos - favor tentar novamente mais tarde!");
        new MultilanguageString
                ("You are temporarily blocked from joining channels - please try again later!",
                        "Du darfst derzeit keine Chatr\u00e4ume betreten - bitte versuch es sp\u00e4ter.",
                        "Vous \u00eates temporairement exclu des canaux - veuillez r\u00e9essayer ult\u00e9rieurement.",
                        "Voc\u00ea est\u00e1 temporariamente impedido de entrar em canais. Tente de novo depois!");
        new MultilanguageString("The channel you tried to join does not exist.",
                "Der von dir gew\u00fcnschte Chatraum existiert nicht.",
                "Le canal que vous essayez de rejoindre n'existe pas.",
                "O canal que voc\u00ea tentou acessar n\u00e3o existe.");
        new MultilanguageString
                ("The channel you tried to join is currently full.",
                        "Der von dir gew\u00fcnschte Chatraum ist derzeit \u00fcberf\u00fcllt.",
                        "Le canal que vous essayez de rejoindre est plein.",
                        "O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.");
        new MultilanguageString
                ("You do not have a high enough rank to join this friends chat channel.",
                        "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.",
                        "Votre rang n'est pas assez \u00e9lev\u00e9 pour rejoindre ce canal de discussion.",
                        "Voc\u00ea n\u00e3o tem uma classifica\u00e7\u00e3o alta o suficiente para participar deste bate-papo entre amigos.");
        new MultilanguageString
                ("You are temporarily banned from this friends chat channel.",
                        "Du wurdest tempor\u00e4r von diesem Freundes-Chatraum gesperrt.",
                        "Vous avez \u00e9t\u00e9 exclu temporairement de ce canal de discussion.",
                        "Voc\u00ea foi temporariamente banido deste bate-papo entre amigos.");
        new MultilanguageString
                ("You are not allowed to join this user's friends chat channel.",
                        "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.",
                        "Vous n'\u00eates pas autoris\u00e9 \u00e0 rejoindre le canal de discussion de cet utilisateur.",
                        "Voc\u00ea n\u00e3o pode participar do bate-papo entre amigos deste usu\u00e1rio.");
        new MultilanguageString(" joined the channel.", " hat den Chatraum betreten.",
                " a rejoint le canal.", " entrou no canal.");
        new MultilanguageString(" left the channel.", " hat den Chatraum verlassen.",
                " a quitt\u00e9 le canal.", " deixou o canal.");
        new MultilanguageString(" was kicked from the channel.",
                " wurde aus dem Chatraum rausgeworfen.",
                " a \u00e9t\u00e9 expuls\u00e9 du canal.",
                " foi expulso do canal.");
        new MultilanguageString("You have been kicked from the channel.",
                "Du wurdest aus dem Chatraum rausgeworfen.",
                "Vous avez \u00e9t\u00e9 expuls\u00e9 du canal.",
                "Voc\u00ea foi expulso do canal.");
        new MultilanguageString("You have been removed from this channel.",
                "Du wurdest aus dem Chatraum entfernt.",
                "Vous avez \u00e9t\u00e9 supprim\u00e9 de ce canal.",
                "Voc\u00ea foi retirado desse canal.");
        new MultilanguageString("You have left the channel.",
                "Du hast den Chatraum verlassen.",
                "Vous avez quitt\u00e9 le canal.",
                "Voc\u00ea saiu do canal.");
        new MultilanguageString("Your friends chat channel has now been enabled!",
                "Dein Freundes-Chat ist jetzt eingeschaltet.",
                "Votre canal de discussion est maintenant activ\u00e9 !",
                "O seu bate-papo entre amigos foi ativado!");
        new MultilanguageString
                ("Join your channel by clicking 'Join Chat' and typing: ",
                        "Klick auf 'Betreten' und gib ein: ",
                        "Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ",
                        "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        new MultilanguageString
                ("Your friends chat channel has now been disabled!",
                        "Dein Freundes-Chat ist jetzt ausgeschaltet.",
                        "Votre canal de discussion est maintenant d\u00e9sactiv\u00e9 !",
                        "O seu bate-papo entre amigos foi desativado!");
        new MultilanguageString
                ("You do not have permission to kick users in this channel.",
                        "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.",
                        "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser des utilisateurs de ce canal.",
                        "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar usu\u00e1rios neste canal.");
        new MultilanguageString
                ("You do not have permission to kick this user.",
                        "Du darfst diesen Benutzer nicht rauswerfen.",
                        "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.",
                        "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar este usu\u00e1rio.");
        new MultilanguageString("That user is not in this channel.",
                "Dieser Benutzer befindet sich nicht in diesem Chatraum.",
                "Cet utilisateur n'est pas dans ce canal.",
                "Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.");
        new MultilanguageString
                ("Your request to kick/ban this user was successful.",
                        "Der Rauswurf/die Sperrung war erfolgreich.",
                        "Votre demande d'exclusion de ce joueur a \u00e9t\u00e9 accept\u00e9e.",
                        "Seu pedido para expulsar/suspender este jogador foi bem sucedido.");
        new MultilanguageString
                ("Your request to refresh this user's temporary ban was successful.",
                        "Die Verl\u00e4ngerung der tempor\u00e4ren Sperrung dieses Spielers war erfolgreich.",
                        "Le renouvellement d'exclusion temporaire de ce joueur a \u00e9t\u00e9 accept\u00e9.",
                        "Seu pedido para reiniciar a suspens\u00e3o tempor\u00e1ria deste jogador foi bem sucedido.");
        new MultilanguageString
                ("You have been temporarily muted due to breaking a rule.",
                        "Aufgrund eines Regelversto\u00dfes wurdest du vor\u00fcbergehend stumm geschaltet.",
                        "La messagerie instantan\u00e9e a \u00e9t\u00e9 temporairement bloqu\u00e9e suite \u00e0 une infraction.",
                        "Voc\u00ea foi temporariamente vetado por ter violado uma regra.");
        new MultilanguageString("This mute will remain for a further ",
                "Diese Stummschaltung gilt f\u00fcr weitere ",
                "Votre acc\u00e8s restera bloqu\u00e9 encore ",
                "Este veto permanecer\u00e1 por mais ");
        new MultilanguageString(" days.", " Tage.", " jours.", " dias.");
        new MultilanguageString
                ("You will be un-muted within 24 hours.",
                        "Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder sprechen k\u00f6nnen.",
                        "Vous aurez \u00e0 nouveau acc\u00e8s \u00e0 clearClip messagerie instantan\u00e9e dans 24 heures.",
                        "O veto ser\u00e1 retirado dentro de 24 horas.");
        new MultilanguageString
                ("To prevent further mutes please read the rules.",
                        "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.",
                        "Pour \u00e9viter un nouveau blocage, lisez le r\u00e8glement.",
                        "Para evitar outros vetos, leia as regras.");
        new MultilanguageString
                ("You have been permanently muted due to breaking a rule.",
                        "Du wurdest permanent stumm geschaltet, da du gegen eine Regel versto\u00dfen hast.",
                        "setFog'acc\u00e8s \u00e0 clearClip messagerie instantan\u00e9e vous a d\u00e9finitivement \u00e9t\u00e9 retir\u00e9 suite \u00e0 une infraction.",
                        "Voc\u00ea foi permanentemente vetado por ter violado uma regra.");
        LOADING_PLEASE_WAIT
                = new MultilanguageString("Loading - please wait.",
                "Ladevorgang - bitte warte.",
                "Chargement en cours. Veuillez patienter.",
                "Carregando. Aguarde.");
        PROFILING = new MultilanguageString("Profiling...", "Profiling...",
                "Profilage...", "Profiling...");
        CONNECTION_LOST
                = new MultilanguageString("Connection lost.", "Verbindung abgebrochen.",
                "Connexion perdue.", "Conex\u00e3o perdida.");
        ATTEMPT_RECONNECT
                = (new MultilanguageString
                ("Please wait - attempting to reestablish.",
                        "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.",
                        "Veuillez patienter - tentative de r\u00e9tablissement.",
                        "Tentando reestabelecer conex\u00e3o. Aguarde."));
        CHECKING_FOR_UPDATES
                = new MultilanguageString("Checking for updates - ", "Suche nach Updates - ",
                "V\u00e9rification des mises \u00e0 jour - ",
                "Verificando atualiza\u00e7\u00f5es - ");
        FETCHING_UPDATES = new MultilanguageString("Fetching Updates - ", "Lade Update - ",
                "Chargement des MAJ - ",
                "Carregando atualiza\u00e7\u00f5es - ");
        new MultilanguageString("Loading config - ", "Lade Konfiguration - ",
                "Chargement des fichiers config - ",
                "Carregando config - ");
        new MultilanguageString("Loaded config", "Konfig geladen.",
                "Fichiers config charg\u00e9s", "Config carregada");
        new MultilanguageString("Loading sprites - ", "Lade Sprites - ",
                "Chargement des sprites - ", "Carregando sprites - ");
        new MultilanguageString("Loaded sprites", "Sprites geladen.",
                "Sprites charg\u00e9s", "Sprites carregados");
        new MultilanguageString("Loading wordpack - ", "Lade Wordpack - ",
                "Chargement du module texte - ",
                "Carregando pacote de palavras - ");
        new MultilanguageString("Loaded wordpack", "Wordpack geladen.",
                "Module texte charg\u00e9",
                "Pacote de palavras carregado");
        new MultilanguageString("Loading anInterfaces - ",
                "Lade Benutzeroberfl\u00e4che - ",
                "Chargement des anInterfaces - ",
                "Carregando anInterfaces - ");
        new MultilanguageString("Loaded anInterfaces", "Benutzeroberfl\u00e4che geladen.",
                "Interfaces charg\u00e9es", "Interfaces carregadas");
        new MultilanguageString("Loading interface scripts - ",
                "Lade Interface-Skripte - ",
                "Chargement des anInterfaces - ",
                "Carregando anInterfaces - ");
        new MultilanguageString("Loaded interface scripts", "Interface-Skripte geladen",
                "Interfaces charg\u00e9es", "Interfaces carregadas");
        new MultilanguageString("Loading additional fonts - ",
                "Lade Zusatzschriftarten - ",
                "Chargement de polices secondaires - ",
                "Carregando fontes principais - ");
        new MultilanguageString("Loaded additional fonts", "Zusatzschriftarten geladen",
                "Polices secondaires charg\u00e9es",
                "Fontes principais carregadas");
        new MultilanguageString("Loading world map - ", "Lade Weltkarte - ",
                "Chargement de clearClip mappemonde - ",
                "Carregando mapa-m\u00fandi - ");
        new MultilanguageString("Loaded world map", "Weltkarte geladen",
                "Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado");
        new MultilanguageString("Loading world list data", "Lade Liste der Welten",
                "Chargement de clearClip liste des serveurs",
                "Carregando dados da lista de mundos");
        new MultilanguageString("Loaded world list data", "Liste der Welten geladen",
                "Liste des serveurs charg\u00e9e",
                "Dados da lista de mundos carregados");
        new MultilanguageString("Loaded client variable data", "Client-Variablen geladen",
                "Variables du client charg\u00e9es",
                "As vari\u00e1veis do sistema foram carregadas");
        LOADING
                = new MultilanguageString("Loading...", "Lade...", "Chargement en cours...",
                "Carregando...");
        new MultilanguageString
                ("Please close the interface you have open before using 'Report Abuse'.",
                        "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
                        "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.",
                        "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        new MultilanguageString(null,
                "bevor du die Option 'Regelversto\u00df melden' benutzt.",
                null, null);
        new MultilanguageString("System update in: ", "System-Update in: ",
                "Mise \u00e0 jour syst\u00e8me dans : ",
                "Atualiza\u00e7\u00e3o do sistema em: ");
        HAS_LOGGED_IN
                = new MultilanguageString(" has logged in.", " loggt sich ein.",
                " s'est connect\u00e9.", " entrou no jogo.");
        HAS_LOGGED_OUT
                = new MultilanguageString(" has logged out.", " loggt sich aus.",
                " s'est d\u00e9connect\u00e9.", " saiu do jogo.");
        UNABLE_TO_FIND
                = new MultilanguageString("Unable to find ",
                "Spieler kann nicht gefunden werden: ",
                "Impossible de trouver ",
                "N\u00e3o \u00e9 poss\u00edvel encontrar ");
        new MultilanguageString("Use", "Benutzen", "Utiliser", "Usar");
        EXAMINE
                = new MultilanguageString("Examine", "Untersuchen", "Examiner", "Examinar");
        ATTACK
                = new MultilanguageString("Attack", "Angreifen", "Attaquer", "Atacar");
        CHOOSE_OPTION
                = new MultilanguageString("Choose Option", "W\u00e4hl eine Option",
                "Choisir une option", "Selecionar op\u00e7\u00e3o");
        MORE_OPTIONS
                = new MultilanguageString(" more options", " weitere Optionen",
                " autres options", " mais op\u00e7\u00f5es");
        WALK_HERE = new MultilanguageString("Walk here", "Hierhin gehen",
                "Atteindre", "Caminhar para c\u00e1");
        FACE_HERE = new MultilanguageString("Face here", "Hierhin drehen",
                "Regarder dans cette direction",
                "Virar para c\u00e1");
        LEVEL
                = new MultilanguageString("level: ", "Stufe: ", "niveau ", "n\u00edvel: ");
        SKILL = new MultilanguageString("skill: ", "Fertigkeit: ",
                "comp\u00e9tence ", "habilidade: ");
        RATING
                = new MultilanguageString("rating: ", "Kampfstufe: ", "classement ",
                "qualifica\u00e7\u00e3o: ");
        PLEASE_WAIT = new MultilanguageString("Please wait...", "Bitte warte...",
                "Veuillez patienter...", "Aguarde...");
        new MultilanguageString
                ("Close",
                        "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,",
                        "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.",
                        "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        SPACE_OR_COLON = new MultilanguageString(" ", ": ", " ", " ");
        MILLION_SUFFIX = new MultilanguageString("M", "M", "M", "M");
        MILLION_SUFFIX_DUPLICATE = new MultilanguageString("M", "M", "M", "M");
        KILO_SUFFIX = new MultilanguageString("getScissor", "T", "getScissor", "getScissor");
        KILO_SUFFIX_DUPLICATE = new MultilanguageString("getScissor", "T", "getScissor", "getScissor");
        new MultilanguageString("From", "Von:", "De", "De");
        SELF = new MultilanguageString("Self", "Mich", "Moi", "Eu");
        ALREADY_FRIENDS
                = new MultilanguageString(" is already on your friends list.",
                " steht bereits auf deiner Freunde-Liste!",
                " est d\u00e9j\u00e0 dans votre liste d'amis.",
                " j\u00e1 est\u00e1 getPixels sua lista de amigos.");
        IGNORE_LIST_FULL
                = (new MultilanguageString
                ("Your ignore list is full. Max of 100 users.",
                        "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.",
                        "Votre liste noire est pleine (100 noms maximum).",
                        "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios."));
        ALREADY_IGNORED
                = new MultilanguageString(" is already on your ignore list.",
                " steht bereits auf deiner Ignorieren-Liste!",
                " est d\u00e9j\u00e0 dans votre liste noire.",
                " j\u00e1 est\u00e1 getPixels sua lista de ignorados.");
        CANT_FRIEND_SELF
                = (new MultilanguageString
                ("You can't add yourself to your own friends list.",
                        "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!",
                        "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste d'amis.",
                        "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos."));
        CANT_IGNORE_SELF
                = (new MultilanguageString
                ("You can't add yourself to your own ignore list.",
                        "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!",
                        "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.",
                        "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de ignorados."));
        new MultilanguageString
                ("Changes will take effect on your friends chat in the next 60 seconds.",
                        "Die \u00c4nderungen am Freundes-Chat werden innerhalb von 60 Sekunden \u00fcbernommen.",
                        "Les modifications seront apport\u00e9s \u00e0 votre canal de discussion dans les 60 prochaines secondes.",
                        "Mundan\u00e7as v\u00e3o ocorrer em seu bate-papo entre amigos nos pr\u00f3ximos 60 segundos.");
        FRIEND_IGNORE_PT1
                = new MultilanguageString("Please remove ", "Bitte entferne ",
                "Veuillez commencer par supprimer ", "Remova ");
        FRIEND_IGNORE_PT2 = new MultilanguageString(" from your ignore list first.",
                " zuerst von deiner Ignorieren-Liste!",
                " de votre liste noire.",
                " da sua lista de ignorados primeiro.");
        IGNORE_ON_FRIEND_PT1
                = new MultilanguageString("Please remove ", "Bitte entferne ",
                "Veuillez commencer par supprimer ", "Remova ");
        IGNORE_ON_FRIEND_PT2 = new MultilanguageString(" from your friends list first.",
                " zuerst von deiner Freunde-Liste!",
                " de votre liste d'amis.",
                " da sua lista de amigos primeiro.");
        YELLOW_CHATCOLOUR
                = new MultilanguageString("yellow:", "gelb:", "jaune:", "amarelo:");
        RED_CHATCOLOUR = new MultilanguageString("red:", "rot:", "rouge:", "vermelho:");
        GREEN_CHATCOLOUR
                = new MultilanguageString("green:", "gr\u00fcn:", "vert:", "verde:");
        CYAN_CHATCOLOUR
                = new MultilanguageString("cyan:", "blaugr\u00fcn:", "cyan:", "cyan:");
        PURPLE_CHATCOLOUR = new MultilanguageString("purple:", "lila:", "violet:", "roxo:");
        WHITE_CHATCOLOUR = new MultilanguageString("white:", "weiss:", "blanc:", "branco:");
        FLASH1_CHATEFFECT
                = new MultilanguageString("flash1:", "blinken1:", "clignotant1:", "flash1:");
        FLASH2_CHATEFFECT
                = new MultilanguageString("flash2:", "blinken2:", "clignotant2:", "flash2:");
        FLASH3_CHATEFFECT
                = new MultilanguageString("flash3:", "blinken3:", "clignotant3:", "brilho3:");
        GLOW1_CHATEFFECT
                = new MultilanguageString("glow1:", "leuchten1:", "brillant1:", "brilho1:");
        GLOW2_CHATEFFECT
                = new MultilanguageString("glow2:", "leuchten2:", "brillant2:", "brilho2:");
        GLOW3_CHATEFFECT
                = new MultilanguageString("glow3:", "leuchten3:", "brillant3:", "brilho3:");
        WAVE_CHATEFFECT
                = new MultilanguageString("wave:", "welle:", "ondulation:", "onda:");
        WAVE2_CHATEFFECT
                = new MultilanguageString("wave2:", "welle2:", "ondulation2:", "onda2:");
        SHAKE_CHATEFFECT = new MultilanguageString("shake:", "sch\u00fctteln:",
                "tremblement:", "tremor:");
        SCROLL_CHATEFFECT = new MultilanguageString("scroll:", "scrollen:",
                "d\u00e9roulement:", "rolagem:");
        SLIDE_CHATEFFECT = new MultilanguageString("slide:", "gleiten:", "glissement:",
                "deslizamento:");
        Skybox.skyboxCache = new Class149(8);
    }
}
