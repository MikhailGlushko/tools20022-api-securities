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
import com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Frequency of the cash distribution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#Final
 * CorporateActionFrequencyTypeV2Code.mmFinal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#Interim
 * CorporateActionFrequencyTypeV2Code.mmInterim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#Regular
 * CorporateActionFrequencyTypeV2Code.mmRegular}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#Special
 * CorporateActionFrequencyTypeV2Code.mmSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#Reinvestment
 * CorporateActionFrequencyTypeV2Code.mmReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code#SpecialDividendWithReinvestment
 * CorporateActionFrequencyTypeV2Code.mmSpecialDividendWithReinvestment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType5Code
 * CorporateActionFrequencyType5Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FINL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionFrequencyTypeV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Frequency of the cash distribution."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionFrequencyTypeV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment of a dividend, less amounts already paid through interim
	 * dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment of a dividend, less amounts already paid through interim dividends."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeV2Code Final = new CorporateActionFrequencyTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Payment of a dividend, less amounts already paid through interim dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Dividend declared and paid before annual earnings have been determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend declared and paid before annual earnings have been determined."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeV2Code Interim = new CorporateActionFrequencyTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			definition = "Dividend declared and paid before annual earnings have been determined.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Dividend paid at regular interval, for example, quarterly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend paid at regular interval, for example, quarterly."</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeV2Code Regular = new CorporateActionFrequencyTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			definition = "Dividend paid at regular interval, for example, quarterly.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "REGR";
		}
	};
	/**
	 * Dividend in addition to the regular dividend being paid by the company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend in addition to the regular dividend being paid by the company."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeV2Code Special = new CorporateActionFrequencyTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Special";
			definition = "Dividend in addition to the regular dividend being paid by the company.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "SPEC";
		}
	};
	/**
	 * Reinvestment of cash distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reinvestment of cash distributed."</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeV2Code Reinvestment = new CorporateActionFrequencyTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinvestment";
			definition = "Reinvestment of cash distributed.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "REIN";
		}
	};
	/**
	 * Special Dividend with reinvestment component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code
	 * CorporateActionFrequencyTypeV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDividendWithReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special Dividend with reinvestment component.  "</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyTypeV2Code SpecialDividendWithReinvestment = new CorporateActionFrequencyTypeV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDividendWithReinvestment";
			definition = "Special Dividend with reinvestment component.  ";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.mmObject();
			codeName = "SPRE";
		}
	};
	final static private LinkedHashMap<String, CorporateActionFrequencyTypeV2Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionFrequencyTypeV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FINL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFrequencyTypeV2Code";
				definition = "Frequency of the cash distribution.";
				derivation_lazy = () -> Arrays.asList(CorporateActionFrequencyType5Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.Final, com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.Interim,
						com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.Regular, com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.Special,
						com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.Reinvestment, com.tools20022.repository.codeset.CorporateActionFrequencyTypeV2Code.SpecialDividendWithReinvestment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Final.getCodeName().get(), Final);
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(Special.getCodeName().get(), Special);
		codesByName.put(Reinvestment.getCodeName().get(), Reinvestment);
		codesByName.put(SpecialDividendWithReinvestment.getCodeName().get(), SpecialDividendWithReinvestment);
	}

	public static CorporateActionFrequencyTypeV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionFrequencyTypeV2Code[] values() {
		CorporateActionFrequencyTypeV2Code[] values = new CorporateActionFrequencyTypeV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionFrequencyTypeV2Code> {
		@Override
		public CorporateActionFrequencyTypeV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionFrequencyTypeV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}