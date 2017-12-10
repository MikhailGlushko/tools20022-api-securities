/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AssetClassSubProductType22Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the sub-product of type Livestock.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType22Code#Livestock
 * AssetClassSubProductType22Code.mmLivestock}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
 * AssetClassSubProductTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetClassSubProductType22Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the sub-product of type Livestock."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType21Code
 * AssetClassSubProductType21Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassSubProductType22Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType22Code
	 * AssetClassSubProductType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Livestock"</li>
	 * </ul>
	 */
	public static final AssetClassSubProductType22Code Livestock = new AssetClassSubProductType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Livestock";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductType22Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Livestock.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassSubProductType22Code> codesByName = new LinkedHashMap<>();

	protected AssetClassSubProductType22Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassSubProductType22Code";
				definition = "Defines the sub-product of type Livestock.";
				previousVersion_lazy = () -> AssetClassSubProductType21Code.mmObject();
				trace_lazy = () -> AssetClassSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassSubProductType22Code.Livestock);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Livestock.getCodeName().get(), Livestock);
	}

	public static AssetClassSubProductType22Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassSubProductType22Code[] values() {
		AssetClassSubProductType22Code[] values = new AssetClassSubProductType22Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassSubProductType22Code> {
		@Override
		public AssetClassSubProductType22Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassSubProductType22Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}