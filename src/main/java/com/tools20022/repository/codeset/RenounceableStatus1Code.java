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
import com.tools20022.repository.codeset.RenounceableStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the renounceable status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RenounceableStatus1Code#NonRenounceable
 * RenounceableStatus1Code.mmNonRenounceable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RenounceableStatus1Code#Renounceable
 * RenounceableStatus1Code.mmRenounceable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RenounceableStatusCode
 * RenounceableStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NREN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RenounceableStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the renounceable status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RenounceableStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RenounceableStatus1Code
	 * RenounceableStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRenounceable"</li>
	 * </ul>
	 */
	public static final RenounceableStatus1Code NonRenounceable = new RenounceableStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRenounceable";
			owner_lazy = () -> com.tools20022.repository.codeset.RenounceableStatus1Code.mmObject();
			codeName = RenounceableStatusCode.NonRenounceable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RenounceableStatus1Code
	 * RenounceableStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Renounceable"</li>
	 * </ul>
	 */
	public static final RenounceableStatus1Code Renounceable = new RenounceableStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Renounceable";
			owner_lazy = () -> com.tools20022.repository.codeset.RenounceableStatus1Code.mmObject();
			codeName = RenounceableStatusCode.Renounceable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RenounceableStatus1Code> codesByName = new LinkedHashMap<>();

	protected RenounceableStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("NREN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RenounceableStatus1Code";
				definition = "Specifies the renounceable status.";
				trace_lazy = () -> RenounceableStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RenounceableStatus1Code.NonRenounceable, com.tools20022.repository.codeset.RenounceableStatus1Code.Renounceable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonRenounceable.getCodeName().get(), NonRenounceable);
		codesByName.put(Renounceable.getCodeName().get(), Renounceable);
	}

	public static RenounceableStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RenounceableStatus1Code[] values() {
		RenounceableStatus1Code[] values = new RenounceableStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RenounceableStatus1Code> {
		@Override
		public RenounceableStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RenounceableStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}