import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("NpcDefinition_modelArchive")
	public static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1508200545
	)
	@Export("id")
	public int id;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1564645859
	)
	@Export("size")
	public int size;
	@ObfuscatedName("q")
	@Export("models")
	int[] models;
	@ObfuscatedName("m")
	int[] field1946;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 541580335
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -78721377
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 292428627
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2069211337
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 152147103
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 820412661
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -461750405
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1886310483
	)
	public int field1944;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -66228151
	)
	public int field1945;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1958989157
	)
	public int field1956;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -348653305
	)
	public int field1947;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1358820143
	)
	public int field1971;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1330583085
	)
	public int field1949;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1745057803
	)
	public int field1950;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1023278713
	)
	public int field1941;
	@ObfuscatedName("z")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("o")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("as")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ac")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ao")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ar")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 305115789
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 621143359
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -145970533
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("aa")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -748389131
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 796069547
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -907008953
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 362388019
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("az")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1358213547
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 178529429
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("aj")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ax")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("av")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.field1944 = -1;
		this.field1945 = -1;
		this.field1956 = -1;
		this.field1947 = -1;
		this.field1971 = -1;
		this.field1949 = -1;
		this.field1950 = -1;
		this.field1941 = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.headIconPrayer = -1;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-494695451"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "36"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "-1721734339"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
		} else if (var2 == 18) {
			var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field1946 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1946[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) {
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) {
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) {
			if (var2 == 107) {
				this.isInteractable = false;
			} else if (var2 == 109) {
				this.isClickable = false;
			} else if (var2 == 111) {
				this.isFollower = true;
			} else if (var2 == 114) {
				this.field1944 = var1.readUnsignedShort();
			} else if (var2 == 115) {
				this.field1944 = var1.readUnsignedShort();
				this.field1945 = var1.readUnsignedShort();
				this.field1956 = var1.readUnsignedShort();
				this.field1947 = var1.readUnsignedShort();
			} else if (var2 == 116) {
				this.field1971 = var1.readUnsignedShort();
			} else if (var2 == 117) {
				this.field1971 = var1.readUnsignedShort();
				this.field1949 = var1.readUnsignedShort();
				this.field1950 = var1.readUnsignedShort();
				this.field1941 = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			var3 = -1;
			if (var2 == 118) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lgd;ILgd;II)Lha;",
		garbageValue = "-301424104"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) {
			NPCComposition var12 = this.transform();
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4);
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id);
			if (var5 == null) {
				boolean var6 = false;

				for (int var7 = 0; var7 < this.models.length; ++var7) {
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) {
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length];

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) {
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) {
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length);
				}

				if (this.recolorFrom != null) {
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
					}
				}

				if (this.retextureFrom != null) {
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var5, (long)this.id);
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) {
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lgu;",
		garbageValue = "1544732553"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) {
			NPCComposition var7 = this.transform();
			return var7 == null ? null : var7.getModelData();
		} else if (this.field1946 == null) {
			return null;
		} else {
			boolean var1 = false;

			for (int var2 = 0; var2 < this.field1946.length; ++var2) {
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1946[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1946.length];

				for (int var3 = 0; var3 < this.field1946.length; ++var3) {
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1946[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0];
				} else {
					var6 = new ModelData(var5, var5.length);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				return var6;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lfs;",
		garbageValue = "-1247651174"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = UserComparator8.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class193.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "395195336"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = UserComparator8.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "30"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return PlayerCompositionColorTextureOverride.method3508(this.params, var1, var2);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-55"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-67"
	)
	static void method3663(int var0, int var1) {
		World.method1782(class146.tempMenuAction, var0, var1);
		class146.tempMenuAction = null;
	}
}
