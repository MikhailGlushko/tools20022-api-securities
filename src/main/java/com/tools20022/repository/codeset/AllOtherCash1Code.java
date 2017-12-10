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
import com.tools20022.repository.codeset.AllOtherCash1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if remaining assets are transferred as cash.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllOtherCash1Code#LiquidatedTransferAsCash
 * AllOtherCash1Code.mmLiquidatedTransferAsCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AllOtherCash1Code#NotLiquidatedTransferAsCash
 * AllOtherCash1Code.mmNotLiquidatedTransferAsCash}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AllOtherCashCode
 * AllOtherCashCode}</li>
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
 * "AllOtherCash1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies if remaining assets are transferred as cash."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AllOtherCash1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllOtherCash1Code
	 * AllOtherCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidatedTransferAsCash"</li>
	 * </ul>
	 */
	public static final AllOtherCash1Code LiquidatedTransferAsCash = new AllOtherCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidatedTransferAsCash";
			owner_lazy = () -> com.tools20022.repository.codeset.AllOtherCash1Code.mmObject();
			codeName = AllOtherCashCode.LiquidatedTransferAsCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AllOtherCash1Code
	 * AllOtherCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotLiquidatedTransferAsCash"</li>
	 * </ul>
	 */
	public static final AllOtherCash1Code NotLiquidatedTransferAsCash = new AllOtherCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotLiquidatedTransferAsCash";
			owner_lazy = () -> com.tools20022.repository.codeset.AllOtherCash1Code.mmObject();
			codeName = AllOtherCashCode.NotLiquidatedTransferAsCash.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AllOtherCash1Code> codesByName = new LinkedHashMap<>();

	protected AllOtherCash1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AllOtherCash1Code";
				definition = "Specifies if remaining assets are transferred as cash.";
				trace_lazy = () -> AllOtherCashCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AllOtherCash1Code.LiquidatedTransferAsCash, com.tools20022.repository.codeset.AllOtherCash1Code.NotLiquidatedTransferAsCash);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LiquidatedTransferAsCash.getCodeName().get(), LiquidatedTransferAsCash);
		codesByName.put(NotLiquidatedTransferAsCash.getCodeName().get(), NotLiquidatedTransferAsCash);
	}

	public static AllOtherCash1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AllOtherCash1Code[] values() {
		AllOtherCash1Code[] values = new AllOtherCash1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AllOtherCash1Code> {
		@Override
		public AllOtherCash1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AllOtherCash1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}