package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;

public class FactoryTest {

    @Test
    public void shouldReturnNewDisplayObjects() {
        Factory factory = new Factory();
        String message = "Welcome";

        assertEquals(Display.class, factory.buildDisplay(message).getClass());
    }

    @Test
    public void shouldReturnNewInputViewObjects() {
        Factory factory = new Factory();

        assertEquals(InputView.class, factory.buildInputView().getClass());
    }

    @Test
    public void shouldReturnNewParserObject() {
        Factory factory = new Factory();
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Authenticator authenticator = mock(Authenticator.class);
        String inputMessage = "1";

        assertEquals(Parser.class, factory.buildParser(inputMessage, library, movieLibrary, session, operationsFactory, authenticator, factory).getClass());
    }

    @Test
    public void shouldReturnNewGuestMenus() {
        Factory factory = new Factory();
        Session session = mock(Session.class);
        when(session.typeOfUser()).thenReturn("guest");

        assertEquals(Menu.class, factory.buildMenu(session).getClass());
    }

    @Test
    public void shouldReturnNewAuthenticatedUsersMenu() {
        Factory factory = new Factory();
        Session session = mock(Session.class);
        when(session.typeOfUser()).thenReturn("customer");

        assertEquals(Menu.class, factory.buildMenu(session).getClass());
    }

    @Test
    public void shouldReturnNewLibrarianMenu() {
        Factory factory = new Factory();
        Session session = mock(Session.class);
        when(session.typeOfUser()).thenReturn("librarian");

        assertEquals(Menu.class, factory.buildMenu(session).getClass());
    }

    @Test
    public void shouldReturnNewAuthenticatorObjects() {
        Factory factory = new Factory();

        assertEquals(Authenticator.class, factory.buildAuthenticator().getClass());
    }
}