package com.github.davidmoten.xsdforms.presentation {
  object Annotation {
    //TODO document each of the annotations in scaladoc

    /**
     * Annotation 'label' is the label to be used for the element
     * input field. Usually located just left of the input field
     * associated with the element with this annotation. If omitted
     * the default value is the element name with dashes and underscores
     * replaced with spaces then camel cased.
     */
    val Label = XsdFormsAnnotation("label")

    /**
     * Annotation 'choice' If choice=inline then choice is inline
     * with radio selector otherwise appears after the group of
     * radio selectors.
     */
    val Choice = XsdFormsAnnotation("choice")

    /**
     * For a radio selector, choice label will go against the selector.
     * Use 'label' against the element itself (which will be made
     * visible by the selector).
     */
    val ChoiceLabel = XsdFormsAnnotation("choiceLabel")

    /**
     * If legend is set then is used as label for a fieldset block.
     */
    val Legend = XsdFormsAnnotation("legend")

    /**
     * 'repeatLabel' is the text on the button that when pressed
     * creates another instance of the element or complexType at
     * that level. The default is '+'.
     */
    val RepeatLabel = XsdFormsAnnotation("repeatLabel")

    /**
     *  'minOccursZeroLabel' is the button label when a sequence of
     *  elements (a complex type) has minOccurs="0". Clicking the
     *  minOccursZero button toggles the visiblity of the sequence.
     */
    val MinOccursZeroLabel = XsdFormsAnnotation("minOccursZeroLabel")

    /**
     * 'removeLabel' is the text on the button that when pressed
     * removes the current instance of the element or complexType.
     * The default is '-'.
     */
    val RemoveLabel = XsdFormsAnnotation("removeLabel")

    /**
     * 'title' is for the text to be used as the title for an element.
     */
    val Title = XsdFormsAnnotation("title")

    /**
     * 'before' is the text to appear before an element.
     */
    val Before = XsdFormsAnnotation("before")

    /**
     * 'after' is the text to appear after an element.
     */
    val After = XsdFormsAnnotation("after")

    /**
     * if text=textarea then html textarea used as input. Otherwise normal
     * short text input used.
     */
    val Text = XsdFormsAnnotation("text")

    /**
     * Specific css for width to be applied to the input element.
     */
    val Width = XsdFormsAnnotation("width")

    /**
     * If selector=radio then radio control used for choice instead
     * of drop down.
     */
    val Selector = XsdFormsAnnotation("selector")

    /**
     * If addBlank=true and an enumeration is being displayed (in a
     * drop-down) then a blank option will be added to the drop-down
     *  representing no selection.
     */
    val AddBlank = XsdFormsAnnotation("addBlank")

    /**
     * 'css' can be set to a group of css styles which will be applied to
     *  the element. For example 'width:20em;font-size:80%'.
     */
    val Css = XsdFormsAnnotation("css")

    /**
     * Validation message to be displayed if the input is assessed
     *  as invalid.
     */
    val Validation = XsdFormsAnnotation("validation")

    /**
     * Help to display as tooltip if user clicks/hovers input. Not a
     * great way of displaying help as it hides whatever is underneath
     * it even if temporarily.
     */
    val Help = XsdFormsAnnotation("help")

    /**
     * On a named element with an enumeration type, set annotation
     * {{{
     * makeVisible="value1->n1,value2->n2"
     * }}}
     * where value1,value2 are enumerated values and n1,n2 integers are the relative
     * indexes (1 equates to the following element at the same level) of the element
     * that is to be made visible on selection of that value.
     * You can also set makeVisible on a specific member of the enumeration using
     * {{{
     * makeVisible="n""
     * }}}where n is an integer only.
     *
     * The element that is to be made visible should be annotated with visible='false'.
     *
     * Make sure you set minOccurs=0 on the element that may be invisible.
     *
     * This annotation also works with boolean types. Use
     * {{{
     * makeVisible="true->1"
     * }}}
     * to make the following element become visible when ticked (and invisible when unticked).
     */
    val MakeVisible = XsdFormsAnnotation("makeVisible")

    /**
     * 'nonRepeatingTitle' is the title displayed after 'title' for a complexType
     * that has maxOccurs > 1.
     */
    val NonRepeatingTitle = XsdFormsAnnotation("nonRepeatingTitle")

    /**
     * Annotation 'description' appears just below the input box.
     */
    val Description = XsdFormsAnnotation("description")

    /**
     * 'visible' = false will hide the element at first. This is most
     *  useful in conjunction with 'makeVisible'.
     */
    val Visible = XsdFormsAnnotation("visible")

    /**
     * 'maxRepeats' should be an integer value >0 for an element and is the
     * maximum number of repeats generated in html of the element (all
     * be them hidden).
     */
    val MaxRepeats = XsdFormsAnnotation("maxRepeats")
    
    val Header = XsdFormsAnnotation("header")
    
    val Footer = XsdFormsAnnotation("footer")
    val ExtraCss = XsdFormsAnnotation("extraCss")
    val ExtraImports = XsdFormsAnnotation("extraImports")
    val ExtraScript= XsdFormsAnnotation("extraScript")
  }

  case class XsdFormsAnnotation(name: String)
}