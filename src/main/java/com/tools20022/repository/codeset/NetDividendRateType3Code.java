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
import com.tools20022.repository.codeset.NetDividendRateType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of net dividend rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#CapitalPortion
 * NetDividendRateType3Code.mmCapitalPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#FullyFranked
 * NetDividendRateType3Code.mmFullyFranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#IncomePortion
 * NetDividendRateType3Code.mmIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#Interest
 * NetDividendRateType3Code.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#RealEstatePropertyIncomePortion
 * NetDividendRateType3Code.mmRealEstatePropertyIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#SundryOrOtherIncome
 * NetDividendRateType3Code.mmSundryOrOtherIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#TaxablePortion
 * NetDividendRateType3Code.mmTaxablePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#TaxDeferred
 * NetDividendRateType3Code.mmTaxDeferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#TaxFree
 * NetDividendRateType3Code.mmTaxFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code#Unfranked
 * NetDividendRateType3Code.mmUnfranked}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
 * DividendRateTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CAPO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetDividendRateType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of net dividend rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NetDividendRateType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalPortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code CapitalPortion = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalPortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.CapitalPortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFranked"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code FullyFranked = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFranked";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.FullyFranked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code IncomePortion = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.IncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code Interest = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstatePropertyIncomePortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code RealEstatePropertyIncomePortion = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstatePropertyIncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.RealEstatePropertyIncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherIncome"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code SundryOrOtherIncome = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.SundryOrOtherIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxablePortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code TaxablePortion = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxablePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.TaxablePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferred"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code TaxDeferred = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferred";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.TaxDeferred.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFree"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code TaxFree = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFree";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.TaxFree.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType3Code
	 * NetDividendRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfranked"</li>
	 * </ul>
	 */
	public static final NetDividendRateType3Code Unfranked = new NetDividendRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfranked";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType3Code.mmObject();
			codeName = DividendRateTypeCode.Unfranked.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NetDividendRateType3Code> codesByName = new LinkedHashMap<>();

	protected NetDividendRateType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAPO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetDividendRateType3Code";
				definition = "Specifies the type of net dividend rate.";
				trace_lazy = () -> DividendRateTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NetDividendRateType3Code.CapitalPortion, com.tools20022.repository.codeset.NetDividendRateType3Code.FullyFranked,
						com.tools20022.repository.codeset.NetDividendRateType3Code.IncomePortion, com.tools20022.repository.codeset.NetDividendRateType3Code.Interest,
						com.tools20022.repository.codeset.NetDividendRateType3Code.RealEstatePropertyIncomePortion, com.tools20022.repository.codeset.NetDividendRateType3Code.SundryOrOtherIncome,
						com.tools20022.repository.codeset.NetDividendRateType3Code.TaxablePortion, com.tools20022.repository.codeset.NetDividendRateType3Code.TaxDeferred, com.tools20022.repository.codeset.NetDividendRateType3Code.TaxFree,
						com.tools20022.repository.codeset.NetDividendRateType3Code.Unfranked);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CapitalPortion.getCodeName().get(), CapitalPortion);
		codesByName.put(FullyFranked.getCodeName().get(), FullyFranked);
		codesByName.put(IncomePortion.getCodeName().get(), IncomePortion);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(RealEstatePropertyIncomePortion.getCodeName().get(), RealEstatePropertyIncomePortion);
		codesByName.put(SundryOrOtherIncome.getCodeName().get(), SundryOrOtherIncome);
		codesByName.put(TaxablePortion.getCodeName().get(), TaxablePortion);
		codesByName.put(TaxDeferred.getCodeName().get(), TaxDeferred);
		codesByName.put(TaxFree.getCodeName().get(), TaxFree);
		codesByName.put(Unfranked.getCodeName().get(), Unfranked);
	}

	public static NetDividendRateType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NetDividendRateType3Code[] values() {
		NetDividendRateType3Code[] values = new NetDividendRateType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NetDividendRateType3Code> {
		@Override
		public NetDividendRateType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NetDividendRateType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}