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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.Spread;
import com.tools20022.repository.entity.VariableInterest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details of a debt instrument in which the periodic interest
 * payments are calculated on the basis of the value (that is, fixing of an
 * underlying reference rate such as the Euribor) on predefined dates (that is,
 * fixing dates) and which has a maturity of no more than one year.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FloatingRateNote2#mmReferenceRateIndex
 * FloatingRateNote2.mmReferenceRateIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FloatingRateNote2#mmBasisPointSpread
 * FloatingRateNote2.mmBasisPointSpread}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VariableInterest
 * VariableInterest}</li>
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
 * "FloatingRateNote2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of a debt instrument in which the periodic interest payments are calculated on the basis of the value (that is, fixing of an underlying reference rate such as the Euribor) on predefined dates (that is, fixing dates) and which has a maturity of no more than one year."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FloatingRateNote2", propOrder = {"referenceRateIndex", "basisPointSpread"})
public class FloatingRateNote2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISINOct2015Identifier referenceRateIndex;
	/**
	 * Underlying reference rate on the basis on which the periodic interest
	 * payments are calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIdentification
	 * Index.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FloatingRateNote2
	 * FloatingRateNote2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefRateIndx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRateIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reference rate on the basis on which the periodic interest payments are calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceRateIndex = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIdentification;
			componentContext_lazy = () -> FloatingRateNote2.mmObject();
			isDerived = false;
			xmlTag = "RefRateIndx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRateIndex";
			definition = "Underlying reference rate on the basis on which the periodic interest payments are calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	protected Number basisPointSpread;
	/**
	 * Number of basis points added to (if positive) or deducted from (if
	 * negative) the underlying reference rate to calculate the actual interest
	 * rate applicable for a given period at issuance of the floating rate
	 * instrument.<br>
	 * <br>
	 * Used to express differences in interest rates, for example, a difference
	 * of 0.10% is equivalent to a change of 10 basis points.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBasisPointSpread
	 * Spread.mmBasisPointSpread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FloatingRateNote2
	 * FloatingRateNote2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsisPtSprd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPointSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of basis points added to (if positive) or deducted from (if negative) the underlying reference rate to calculate the actual interest rate applicable for a given period at issuance of the floating rate instrument.\r\n\r\nUsed to express differences in interest rates, for example, a difference of 0.10% is equivalent to a change of 10 basis points."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasisPointSpread = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Spread.mmBasisPointSpread;
			componentContext_lazy = () -> FloatingRateNote2.mmObject();
			isDerived = false;
			xmlTag = "BsisPtSprd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisPointSpread";
			definition = "Number of basis points added to (if positive) or deducted from (if negative) the underlying reference rate to calculate the actual interest rate applicable for a given period at issuance of the floating rate instrument.\r\n\r\nUsed to express differences in interest rates, for example, a difference of 0.10% is equivalent to a change of 10 basis points.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FloatingRateNote2.mmReferenceRateIndex, FloatingRateNote2.mmBasisPointSpread);
				trace_lazy = () -> VariableInterest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FloatingRateNote2";
				definition = "Provides the details of a debt instrument in which the periodic interest payments are calculated on the basis of the value (that is, fixing of an underlying reference rate such as the Euribor) on predefined dates (that is, fixing dates) and which has a maturity of no more than one year.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RefRateIndx", required = true)
	public ISINOct2015Identifier getReferenceRateIndex() {
		return referenceRateIndex;
	}

	public void setReferenceRateIndex(ISINOct2015Identifier referenceRateIndex) {
		this.referenceRateIndex = referenceRateIndex;
	}

	@XmlElement(name = "BsisPtSprd", required = true)
	public Number getBasisPointSpread() {
		return basisPointSpread;
	}

	public void setBasisPointSpread(Number basisPointSpread) {
		this.basisPointSpread = basisPointSpread;
	}
}