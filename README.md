Class Archivos
java.lang.Object 
interfaz.Archivos

public class Archivos extends Object
La clase Archivos proporciona funcionalidades para crear, registrar líneas y limpiar archivos en el sistema de archivos.
· Constructor Summary
Constructors
Constructor
Description
Archivos(String nombre)
Constructor de la clase Archivos.
· Method Summary
All MethodsInstance MethodsConcrete Methods
Modifier and Type
Method
Description
void
create(String ruta)
Crea un nuevo archivo en la ruta especificada.
File
getArchivo()
Obtiene el archivo actual.
String
getNombre()
Obtiene el nombre del archivo.
boolean
limpiarArchivo()
Elimina el contenido del archivo y lo reinicia.
boolean
registrar(String linea)
Registra una línea de texto en el archivo.
void
setArchivo(File archivo)
Establece un nuevo archivo.
void
setNombre(String nombre)
Establece el nombre del archivo.
Methods inherited from class java.lang.Object
clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait
· Constructor Details
o Archivos
public Archivos(String nombre)
Constructor de la clase Archivos.
Parameters:
nombre - El nombre del archivo.
· Method Details
o create
public void create(String ruta) throws IOException
Crea un nuevo archivo en la ruta especificada.
Parameters:
ruta - La ruta donde se creará el archivo.
Throws:
IOException - Si ocurre un error al crear el archivo.
o getNombre
public String getNombre()
Obtiene el nombre del archivo.
Returns:
El nombre del archivo.
o registrar
public boolean registrar(String linea)
Registra una línea de texto en el archivo. Si el archivo no existe, no se realiza ninguna acción.
Parameters:
linea - La línea de texto que se registrará en el archivo.
Returns:
true si el registro fue exitoso, false en caso de error.
o limpiarArchivo
public boolean limpiarArchivo()
Elimina el contenido del archivo y lo reinicia.
Returns:
true si la operación fue exitosa, false en caso contrario.
o setNombre
public void setNombre(String nombre)
Establece el nombre del archivo.
Parameters:
nombre - El nombre a establecer.
o getArchivo
public File getArchivo()
Obtiene el archivo actual.
Returns:
El archivo actual.
o setArchivo
public void setArchivo(File archivo)
Establece un nuevo archivo.
Parameters:
archivo - El archivo a establecer.



Class Loggin
java.lang.Object 
interfaz.Loggin
All Implemented Interfaces:
ActionListener, EventListener

public class Loggin extends Object implements ActionListener
La clase Loggin gestiona la interfaz de usuario para iniciar sesión en la aplicación. Permite que los usuarios ingresen sus credenciales, las valide y les permita acceder o registrarse. Utiliza un archivo de texto para almacenar las credenciales de los usuarios. Implementa ActionListener para manejar eventos de botones.
· Constructor Summary
Constructors
Constructor
Description
Loggin()
Constructor de la clase Loggin.
· Method Summary
All MethodsInstance MethodsConcrete Methods
Modifier and Type
Method
Description
void
actionPerformed(ActionEvent e)
Maneja los eventos de los botones de la interfaz.
void
refreshUsers()
Refresca la lista de usuarios recargándolos desde el archivo de texto.
void
setVisible(boolean visible)
Establece la visibilidad del frame principal de la ventana de inicio de sesión.
Methods inherited from class java.lang.Object
clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait
· Constructor Details
o Loggin
public Loggin()
Constructor de la clase Loggin. Carga la base de datos de usuarios y configura los componentes de la interfaz gráfica.
· Method Details
o actionPerformed
public void actionPerformed(ActionEvent e)
Maneja los eventos de los botones de la interfaz. Verifica las credenciales ingresadas o permite al usuario registrarse.
Specified by:
actionPerformed in interface ActionListener
Parameters:
e - El evento de acción generado.
o refreshUsers
public void refreshUsers()
Refresca la lista de usuarios recargándolos desde el archivo de texto.
o setVisible
public void setVisible(boolean visible)
Establece la visibilidad del frame principal de la ventana de inicio de sesión.
Parameters:
visible - true para hacer visible el frame, false para ocultarlo.



Class Register
java.lang.Object 
interfaz.Register
All Implemented Interfaces:
ActionListener, EventListener

public class Register extends Object implements ActionListener
La clase Register proporciona una interfaz gráfica para que los usuarios puedan registrarse. Se asegura de que las contraseñas coincidan antes de guardar los detalles del usuario en un archivo.
· Constructor Summary
Constructors
Constructor
Description
Register()
Constructor que inicializa la interfaz de registro y configura los componentes.
· Method Summary
All MethodsInstance MethodsConcrete Methods
Modifier and Type
Method
Description
void
actionPerformed(ActionEvent e)
Método que maneja las acciones de los botones de la interfaz.
Methods inherited from class java.lang.Object
clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait
· Constructor Details
o Register
public Register()
Constructor que inicializa la interfaz de registro y configura los componentes.
· Method Details
o actionPerformed
public void actionPerformed(ActionEvent e)
Método que maneja las acciones de los botones de la interfaz. Se asegura de que las contraseñas coincidan y guarda el usuario registrado en un archivo.
Specified by:
actionPerformed in interface ActionListener
Parameters:
e - El evento que se genera cuando se hace clic en un botón.




Class ventana
java.lang.Object 
interfaz.ventana
All Implemented Interfaces:
ActionListener, EventListener

public class ventana extends Object implements ActionListener
Clase ventana que representa una calculadora con interfaz gráfica. Implementa la interfaz ActionListener para manejar eventos de acción en los botones.
· Constructor Summary
Constructors
Constructor
Description
ventana(String usuario)
Constructor que inicializa la calculadora y la interfaz gráfica.
· Method Summary
All MethodsInstance MethodsConcrete Methods
Modifier and Type
Method
Description
void
actionPerformed(ActionEvent e)
Maneja los eventos de acción para todos los botones de la calculadora.
void
calcular()
Realiza el cálculo de la expresión ingresada en el campo de entrada.
void
cargarOperacionesDesdeArchivo()
Carga las operaciones guardadas desde un archivo.
void
dividir()
Realiza la operación de división entre dos números extraídos de la entrada.
void
identificar()
Identifica la operación aritmética basada en el operador que se encuentra en la entrada.
void
modificarOperacion(int indice, String nuevaOperacion)
 
void
multiplicar()
Realiza la operación de multiplicación entre dos números extraídos de la entrada.
void
porcentaje()
Calcula el porcentaje de un número introducido en la entrada.
void
punto()
Agrega un punto decimal al número actual en la entrada.
void
restar()
Realiza la operación de resta entre dos números extraídos de la entrada.
void
sumar()
Realiza la operación de suma entre dos números extraídos de la entrada.
Methods inherited from class java.lang.Object
clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait
· Constructor Details
o ventana
public ventana(String usuario) throws IOException
Constructor que inicializa la calculadora y la interfaz gráfica.
Parameters:
usuario - Nombre del usuario.
Throws:
IOException - Si ocurre un error al crear el archivo de actividades.
· Method Details
o actionPerformed
public void actionPerformed(ActionEvent e)
Maneja los eventos de acción para todos los botones de la calculadora.
Specified by:
actionPerformed in interface ActionListener
Parameters:
e - Evento de acción.
o cargarOperacionesDesdeArchivo
public void cargarOperacionesDesdeArchivo()
Carga las operaciones guardadas desde un archivo.
o modificarOperacion
public void modificarOperacion(int indice, String nuevaOperacion)
o calcular
public void calcular()
Realiza el cálculo de la expresión ingresada en el campo de entrada.
o sumar
public void sumar() throws IOException
Realiza la operación de suma entre dos números extraídos de la entrada.
Throws:
IOException - Si ocurre un error al registrar la operación en el archivo.
o restar
public void restar() throws IOException
Realiza la operación de resta entre dos números extraídos de la entrada.
Throws:
IOException - Si ocurre un error al registrar la operación en el archivo.
o multiplicar
public void multiplicar() throws IOException
Realiza la operación de multiplicación entre dos números extraídos de la entrada.
Throws:
IOException - Si ocurre un error al registrar la operación en el archivo.
o dividir
public void dividir() throws IOException
Realiza la operación de división entre dos números extraídos de la entrada.
Throws:
IOException - Si ocurre un error al registrar la operación en el archivo.
o porcentaje
public void porcentaje() throws IOException
Calcula el porcentaje de un número introducido en la entrada.
Throws:
IOException - Si ocurre un error al registrar la operación en el archivo.
o punto
public void punto() throws IOException
Agrega un punto decimal al número actual en la entrada.
Throws:
IOException - Si ocurre un error al registrar la operación en el archivo.
o identificar
public void identificar() throws IOException
Identifica la operación aritmética basada en el operador que se encuentra en la entrada.
Throws:
IOException - Si ocurre un error al realizar o registrar la operación.



Class botonCircular
java.lang.Object 
java.awt.Component 
java.awt.Container 
javax.swing.JComponent 
javax.swing.AbstractButton 
javax.swing.JButton 
interfaz.botonCircular
All Implemented Interfaces:
ImageObserver, ItemSelectable, MenuContainer, Serializable, Accessible, SwingConstants

public class botonCircular extends JButton
La clase botonCircular extiende JButton para crear un botón con forma circular. Este botón personalizado se dibuja como un círculo y responde visualmente a las acciones del usuario como un botón estándar.
See Also:
· Serialized Form
· Nested Class Summary
Nested classes/interfaces inherited from class javax.swing.JButton
JButton.AccessibleJButton
Nested classes/interfaces inherited from class javax.swing.AbstractButton
AbstractButton.AccessibleAbstractButton, AbstractButton.ButtonChangeListener
Nested classes/interfaces inherited from class javax.swing.JComponent
JComponent.AccessibleJComponent
Nested classes/interfaces inherited from class java.awt.Container
Container.AccessibleAWTContainer
Nested classes/interfaces inherited from class java.awt.Component
Component.AccessibleAWTComponent, Component.BaselineResizeBehavior, Component.BltBufferStrategy, Component.FlipBufferStrategy
· Field Summary
Fields inherited from class javax.swing.AbstractButton
actionListener, BORDER_PAINTED_CHANGED_PROPERTY, changeEvent, changeListener, CONTENT_AREA_FILLED_CHANGED_PROPERTY, DISABLED_ICON_CHANGED_PROPERTY, DISABLED_SELECTED_ICON_CHANGED_PROPERTY, FOCUS_PAINTED_CHANGED_PROPERTY, HORIZONTAL_ALIGNMENT_CHANGED_PROPERTY, HORIZONTAL_TEXT_POSITION_CHANGED_PROPERTY, ICON_CHANGED_PROPERTY, itemListener, MARGIN_CHANGED_PROPERTY, MNEMONIC_CHANGED_PROPERTY, model, MODEL_CHANGED_PROPERTY, PRESSED_ICON_CHANGED_PROPERTY, ROLLOVER_ENABLED_CHANGED_PROPERTY, ROLLOVER_ICON_CHANGED_PROPERTY, ROLLOVER_SELECTED_ICON_CHANGED_PROPERTY, SELECTED_ICON_CHANGED_PROPERTY, TEXT_CHANGED_PROPERTY, VERTICAL_ALIGNMENT_CHANGED_PROPERTY, VERTICAL_TEXT_POSITION_CHANGED_PROPERTY
Fields inherited from class javax.swing.JComponent
listenerList, TOOL_TIP_TEXT_KEY, ui, UNDEFINED_CONDITION, WHEN_ANCESTOR_OF_FOCUSED_COMPONENT, WHEN_FOCUSED, WHEN_IN_FOCUSED_WINDOW
Fields inherited from class java.awt.Component
accessibleContext, BOTTOM_ALIGNMENT, CENTER_ALIGNMENT, LEFT_ALIGNMENT, RIGHT_ALIGNMENT, TOP_ALIGNMENT
Fields inherited from interface java.awt.image.ImageObserver
ABORT, ALLBITS, ERROR, FRAMEBITS, HEIGHT, PROPERTIES, SOMEBITS, WIDTH
Fields inherited from interface javax.swing.SwingConstants
BOTTOM, CENTER, EAST, HORIZONTAL, LEADING, LEFT, NEXT, NORTH, NORTH_EAST, NORTH_WEST, PREVIOUS, RIGHT, SOUTH, SOUTH_EAST, SOUTH_WEST, TOP, TRAILING, VERTICAL, WEST
· Constructor Summary
Constructors
Constructor
Description
botonCircular(String texto)
Constructor que crea un botón circular con el texto especificado.
· Method Summary
All MethodsInstance MethodsConcrete Methods
Modifier and Type
Method
Description
boolean
contains(int x, int y)
Sobrescribe el método JComponent.contains(int, int) para definir que el área activa del botón sea un círculo en lugar de un rectángulo.
Dimension
getPreferredSize()
Sobrescribe el método JComponent.getPreferredSize() para asegurar que el botón sea cuadrado con el diámetro basado en el mayor de los dos (ancho o alto).
protected void
paintBorder(Graphics g)
Sobrescribe el método AbstractButton.paintBorder(Graphics) para dibujar un borde circular.
protected void
paintComponent(Graphics g)
Sobrescribe el método JComponent.paintComponent(Graphics) para personalizar la apariencia del botón.
Methods inherited from class javax.swing.JButton
getAccessibleContext, getUIClassID, isDefaultButton, isDefaultCapable, paramString, removeNotify, setDefaultCapable, updateUI
Methods inherited from class javax.swing.AbstractButton
actionPropertyChanged, addActionListener, addChangeListener, addImpl, addItemListener, checkHorizontalKey, checkVerticalKey, configurePropertiesFromAction, createActionListener, createActionPropertyChangeListener, createChangeListener, createItemListener, doClick, doClick, fireActionPerformed, fireItemStateChanged, fireStateChanged, getAction, getActionCommand, getActionListeners, getChangeListeners, getDisabledIcon, getDisabledSelectedIcon, getDisplayedMnemonicIndex, getHideActionText, getHorizontalAlignment, getHorizontalTextPosition, getIcon, getIconTextGap, getItemListeners, getLabel, getMargin, getMnemonic, getModel, getMultiClickThreshhold, getPressedIcon, getRolloverIcon, getRolloverSelectedIcon, getSelectedIcon, getSelectedObjects, getText, getUI, getVerticalAlignment, getVerticalTextPosition, imageUpdate, init, isBorderPainted, isContentAreaFilled, isFocusPainted, isRolloverEnabled, isSelected, removeActionListener, removeChangeListener, removeItemListener, setAction, setActionCommand, setBorderPainted, setContentAreaFilled, setDisabledIcon, setDisabledSelectedIcon, setDisplayedMnemonicIndex, setEnabled, setFocusPainted, setHideActionText, setHorizontalAlignment, setHorizontalTextPosition, setIcon, setIconTextGap, setLabel, setLayout, setMargin, setMnemonic, setMnemonic, setModel, setMultiClickThreshhold, setPressedIcon, setRolloverEnabled, setRolloverIcon, setRolloverSelectedIcon, setSelected, setSelectedIcon, setText, setUI, setVerticalAlignment, setVerticalTextPosition
Methods inherited from class javax.swing.JComponent
addAncestorListener, addNotify, addVetoableChangeListener, computeVisibleRect, createToolTip, disable, enable, firePropertyChange, firePropertyChange, firePropertyChange, fireVetoableChange, getActionForKeyStroke, getActionMap, getAlignmentX, getAlignmentY, getAncestorListeners, getAutoscrolls, getBaseline, getBaselineResizeBehavior, getBorder, getBounds, getClientProperty, getComponentGraphics, getComponentPopupMenu, getConditionForKeyStroke, getDebugGraphicsOptions, getDefaultLocale, getFontMetrics, getGraphics, getHeight, getInheritsPopupMenu, getInputMap, getInputMap, getInputVerifier, getInsets, getInsets, getListeners, getLocation, getMaximumSize, getMinimumSize, getNextFocusableComponent, getPopupLocation, getRegisteredKeyStrokes, getRootPane, getSize, getToolTipLocation, getToolTipText, getToolTipText, getTopLevelAncestor, getTransferHandler, getVerifyInputWhenFocusTarget, getVetoableChangeListeners, getVisibleRect, getWidth, getX, getY, grabFocus, hide, isDoubleBuffered, isLightweightComponent, isManagingFocus, isOpaque, isOptimizedDrawingEnabled, isPaintingForPrint, isPaintingOrigin, isPaintingTile, isRequestFocusEnabled, isValidateRoot, paint, paintChildren, paintImmediately, paintImmediately, print, printAll, printBorder, printChildren, printComponent, processComponentKeyEvent, processKeyBinding, processKeyEvent, processMouseEvent, processMouseMotionEvent, putClientProperty, registerKeyboardAction, registerKeyboardAction, removeAncestorListener, removeVetoableChangeListener, repaint, repaint, requestDefaultFocus, requestFocus, requestFocus, requestFocusInWindow, requestFocusInWindow, resetKeyboardActions, reshape, revalidate, scrollRectToVisible, setActionMap, setAlignmentX, setAlignmentY, setAutoscrolls, setBackground, setBorder, setComponentPopupMenu, setDebugGraphicsOptions, setDefaultLocale, setDoubleBuffered, setFocusTraversalKeys, setFont, setForeground, setInheritsPopupMenu, setInputMap, setInputVerifier, setMaximumSize, setMinimumSize, setNextFocusableComponent, setOpaque, setPreferredSize, setRequestFocusEnabled, setToolTipText, setTransferHandler, setUI, setVerifyInputWhenFocusTarget, setVisible, unregisterKeyboardAction, update
Methods inherited from class java.awt.Container
add, add, add, add, add, addContainerListener, addPropertyChangeListener, addPropertyChangeListener, applyComponentOrientation, areFocusTraversalKeysSet, countComponents, deliverEvent, doLayout, findComponentAt, findComponentAt, getComponent, getComponentAt, getComponentAt, getComponentCount, getComponents, getComponentZOrder, getContainerListeners, getFocusTraversalKeys, getFocusTraversalPolicy, getLayout, getMousePosition, insets, invalidate, isAncestorOf, isFocusCycleRoot, isFocusCycleRoot, isFocusTraversalPolicyProvider, isFocusTraversalPolicySet, layout, list, list, locate, minimumSize, paintComponents, preferredSize, printComponents, processContainerEvent, processEvent, remove, remove, removeAll, removeContainerListener, setComponentZOrder, setFocusCycleRoot, setFocusTraversalPolicy, setFocusTraversalPolicyProvider, transferFocusDownCycle, validate, validateTree
Methods inherited from class java.awt.Component
action, add, addComponentListener, addFocusListener, addHierarchyBoundsListener, addHierarchyListener, addInputMethodListener, addKeyListener, addMouseListener, addMouseMotionListener, addMouseWheelListener, bounds, checkImage, checkImage, coalesceEvents, contains, createImage, createImage, createVolatileImage, createVolatileImage, disableEvents, dispatchEvent, enable, enableEvents, enableInputMethods, firePropertyChange, firePropertyChange, firePropertyChange, firePropertyChange, firePropertyChange, firePropertyChange, getBackground, getBounds, getColorModel, getComponentListeners, getComponentOrientation, getCursor, getDropTarget, getFocusCycleRootAncestor, getFocusListeners, getFocusTraversalKeysEnabled, getFont, getForeground, getGraphicsConfiguration, getHierarchyBoundsListeners, getHierarchyListeners, getIgnoreRepaint, getInputContext, getInputMethodListeners, getInputMethodRequests, getKeyListeners, getLocale, getLocation, getLocationOnScreen, getMouseListeners, getMouseMotionListeners, getMousePosition, getMouseWheelListeners, getName, getParent, getPropertyChangeListeners, getPropertyChangeListeners, getSize, getToolkit, getTreeLock, gotFocus, handleEvent, hasFocus, inside, isBackgroundSet, isCursorSet, isDisplayable, isEnabled, isFocusable, isFocusOwner, isFocusTraversable, isFontSet, isForegroundSet, isLightweight, isMaximumSizeSet, isMinimumSizeSet, isPreferredSizeSet, isShowing, isValid, isVisible, keyDown, keyUp, list, list, list, location, lostFocus, mouseDown, mouseDrag, mouseEnter, mouseExit, mouseMove, mouseUp, move, nextFocus, paintAll, postEvent, prepareImage, prepareImage, processComponentEvent, processFocusEvent, processHierarchyBoundsEvent, processHierarchyEvent, processInputMethodEvent, processMouseWheelEvent, remove, removeComponentListener, removeFocusListener, removeHierarchyBoundsListener, removeHierarchyListener, removeInputMethodListener, removeKeyListener, removeMouseListener, removeMouseMotionListener, removeMouseWheelListener, removePropertyChangeListener, removePropertyChangeListener, repaint, repaint, repaint, requestFocus, requestFocus, requestFocusInWindow, resize, resize, setBounds, setBounds, setComponentOrientation, setCursor, setDropTarget, setFocusable, setFocusTraversalKeysEnabled, setIgnoreRepaint, setLocale, setLocation, setLocation, setMixingCutoutShape, setName, setSize, setSize, show, show, size, toString, transferFocus, transferFocusBackward, transferFocusUpCycle
Methods inherited from class java.lang.Object
clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait
· Constructor Details
o botonCircular
public botonCircular(String texto)
Constructor que crea un botón circular con el texto especificado.
Parameters:
texto - El texto que se mostrará en el botón.
· Method Details
o paintComponent
protected void paintComponent(Graphics g)
Sobrescribe el método JComponent.paintComponent(Graphics) para personalizar la apariencia del botón. Dibuja un óvalo que simula un botón circular.
Overrides:
paintComponent in class JComponent
Parameters:
g - El objeto Graphics usado para dibujar el botón.
o paintBorder
protected void paintBorder(Graphics g)
Sobrescribe el método AbstractButton.paintBorder(Graphics) para dibujar un borde circular.
Overrides:
paintBorder in class AbstractButton
Parameters:
g - El objeto Graphics usado para dibujar el borde del botón.
o getPreferredSize
public Dimension getPreferredSize()
Sobrescribe el método JComponent.getPreferredSize() para asegurar que el botón sea cuadrado con el diámetro basado en el mayor de los dos (ancho o alto).
Overrides:
getPreferredSize in class JComponent
Returns:
Las dimensiones preferidas del botón circular.
o contains
public boolean contains(int x, int y)
Sobrescribe el método JComponent.contains(int, int) para definir que el área activa del botón sea un círculo en lugar de un rectángulo.
Overrides:
contains in class JComponent
Parameters:
x - Coordenada X del punto a verificar.
y - Coordenada Y del punto a verificar.
Returns:
true si el punto (x, y) está dentro del círculo, de lo contrario false.
