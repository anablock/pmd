/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast;

import scala.meta.Mod;

/**
 * The ASTModSealed node implementation.
 */
public class ASTModSealed extends AbstractScalaNode<Mod.Sealed> {

    /**
     * Create the AST node for this Scala node.
     * 
     * @param scalaNode
     *            the underlying Scala node
     */
    public ASTModSealed(Mod.Sealed scalaNode) {
        super(scalaNode);
    }

    @Override
    public <D, R> R accept(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}
