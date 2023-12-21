package Trees.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class TreeResourceFactory extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new XMIResourceImpl(uri) {
			@Override
			protected boolean useUUIDs() {
				return true;
			}
		};
	}

}
