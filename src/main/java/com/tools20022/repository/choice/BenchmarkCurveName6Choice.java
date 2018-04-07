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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.BenchmarkCurveName2Code;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.Max25Text;
import com.tools20022.repository.entity.Curve;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for benchmark curve name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmISIN
 * BenchmarkCurveName6Choice.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmIndex
 * BenchmarkCurveName6Choice.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmName
 * BenchmarkCurveName6Choice.mmName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BenchmarkCurveName6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for benchmark curve name."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BenchmarkCurveName6Choice", propOrder = {"iSIN", "index", "name"})
public class BenchmarkCurveName6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN", required = true)
	protected ISINOct2015Identifier iSIN;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice
	 * BenchmarkCurveName6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN) identifier of an index / benchmark."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BenchmarkCurveName6Choice, ISINOct2015Identifier> mmISIN = new MMMessageAttribute<BenchmarkCurveName6Choice, ISINOct2015Identifier>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.BenchmarkCurveName6Choice.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN) identifier of an index / benchmark.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public ISINOct2015Identifier getValue(BenchmarkCurveName6Choice obj) {
			return obj.getISIN();
		}

		@Override
		public void setValue(BenchmarkCurveName6Choice obj, ISINOct2015Identifier value) {
			obj.setISIN(value);
		}
	};
	@XmlElement(name = "Indx", required = true)
	protected BenchmarkCurveName2Code index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Curve#mmName Curve.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice
	 * BenchmarkCurveName6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Indx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the index / benchmark of a floating rate bond."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BenchmarkCurveName6Choice, BenchmarkCurveName2Code> mmIndex = new MMMessageAttribute<BenchmarkCurveName6Choice, BenchmarkCurveName2Code>() {
		{
			businessElementTrace_lazy = () -> Curve.mmName;
			componentContext_lazy = () -> com.tools20022.repository.choice.BenchmarkCurveName6Choice.mmObject();
			isDerived = false;
			xmlTag = "Indx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Name of the index / benchmark of a floating rate bond.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BenchmarkCurveName2Code.mmObject();
		}

		@Override
		public BenchmarkCurveName2Code getValue(BenchmarkCurveName6Choice obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(BenchmarkCurveName6Choice obj, BenchmarkCurveName2Code value) {
			obj.setIndex(value);
		}
	};
	@XmlElement(name = "Nm", required = true)
	protected Max25Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max25Text
	 * Max25Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Curve#mmName Curve.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice
	 * BenchmarkCurveName6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the name that should be used where no ISIN or standardized name of the index exists, including its term (such as ‘EURIBOR6M’, ‘LIBOR3M’)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BenchmarkCurveName6Choice, Max25Text> mmName = new MMMessageAttribute<BenchmarkCurveName6Choice, Max25Text>() {
		{
			businessElementTrace_lazy = () -> Curve.mmName;
			componentContext_lazy = () -> com.tools20022.repository.choice.BenchmarkCurveName6Choice.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Provides the name that should be used where no ISIN or standardized name of the index exists, including its term (such as ‘EURIBOR6M’, ‘LIBOR3M’).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max25Text.mmObject();
		}

		@Override
		public Max25Text getValue(BenchmarkCurveName6Choice obj) {
			return obj.getName();
		}

		@Override
		public void setValue(BenchmarkCurveName6Choice obj, Max25Text value) {
			obj.setName(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BenchmarkCurveName6Choice.mmISIN, com.tools20022.repository.choice.BenchmarkCurveName6Choice.mmIndex,
						com.tools20022.repository.choice.BenchmarkCurveName6Choice.mmName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BenchmarkCurveName6Choice";
				definition = "Choice of format for benchmark curve name.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISINOct2015Identifier getISIN() {
		return iSIN;
	}

	public BenchmarkCurveName6Choice setISIN(ISINOct2015Identifier iSIN) {
		this.iSIN = Objects.requireNonNull(iSIN);
		return this;
	}

	public BenchmarkCurveName2Code getIndex() {
		return index;
	}

	public BenchmarkCurveName6Choice setIndex(BenchmarkCurveName2Code index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public Max25Text getName() {
		return name;
	}

	public BenchmarkCurveName6Choice setName(Max25Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}
}