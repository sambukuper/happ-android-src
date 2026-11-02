.class public final Lkf;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvg5;


# instance fields
.field public final X:Ljava/lang/String;

.field public final Y:Lo88;

.field public final Z:Ljava/util/List;

.field public final f0:Ljava/util/List;

.field public final g0:Lfi2;

.field public final h0:Lfi1;

.field public final i0:Lph;

.field public final j0:Ljava/lang/CharSequence;

.field public final k0:Le34;

.field public l0:Lzv7;

.field public final m0:Z

.field public final n0:I

.field public final o0:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo88;Ljava/util/List;Ljava/util/List;Lfi2;Lfi1;Z)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p6

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    .line 2
    iput-object v4, v0, Lkf;->X:Ljava/lang/String;

    .line 3
    iput-object v1, v0, Lkf;->Y:Lo88;

    .line 4
    iput-object v2, v0, Lkf;->Z:Ljava/util/List;

    move-object/from16 v4, p4

    .line 5
    iput-object v4, v0, Lkf;->f0:Ljava/util/List;

    move-object/from16 v4, p5

    .line 6
    iput-object v4, v0, Lkf;->g0:Lfi2;

    .line 7
    iput-object v3, v0, Lkf;->h0:Lfi1;

    .line 8
    new-instance v4, Lph;

    invoke-interface {v3}, Lfi1;->getDensity()F

    move-result v5

    const/4 v6, 0x1

    .line 9
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 10
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 11
    sget-object v5, Lx38;->b:Lx38;

    .line 12
    iput-object v5, v4, Lph;->b:Lx38;

    const/4 v5, 0x3

    .line 13
    iput-byte v5, v4, Lph;->c:B

    .line 14
    sget-object v7, Lt67;->d:Lt67;

    .line 15
    iput-object v7, v4, Lph;->d:Lt67;

    .line 16
    iput-object v4, v0, Lkf;->i0:Lph;

    .line 17
    invoke-static {v1}, Lz39;->w(Lo88;)Z

    move-result v7

    iget-object v8, v1, Lo88;->a:Lqe7;

    iget-object v1, v1, Lo88;->b:Lxg5;

    const/4 v9, 0x0

    if-nez v7, :cond_0

    move v7, v9

    goto :goto_1

    .line 18
    :cond_0
    sget-object v7, Ldz1;->a:Lwl6;

    .line 19
    sget-object v7, Ldz1;->a:Lwl6;

    .line 20
    iget-object v10, v7, Lwl6;->Y:Ljava/lang/Object;

    check-cast v10, Llh7;

    if-eqz v10, :cond_1

    goto :goto_0

    .line 21
    :cond_1
    invoke-static {}, Lyy1;->d()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 22
    invoke-virtual {v7}, Lwl6;->O()Llh7;

    move-result-object v10

    iput-object v10, v7, Lwl6;->Y:Ljava/lang/Object;

    goto :goto_0

    .line 23
    :cond_2
    sget-object v10, Lyn0;->c:Lw73;

    .line 24
    :goto_0
    invoke-interface {v10}, Llh7;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 25
    :goto_1
    iput-boolean v7, v0, Lkf;->m0:Z

    .line 26
    iget v7, v1, Lxg5;->b:I

    .line 27
    iget-object v10, v8, Lqe7;->k:Lge4;

    const/4 v11, 0x4

    const/4 v13, 0x2

    if-ne v7, v11, :cond_4

    :cond_3
    :goto_2
    move v7, v13

    goto :goto_4

    :cond_4
    const/4 v11, 0x5

    if-ne v7, v11, :cond_6

    :cond_5
    move v7, v5

    goto :goto_4

    :cond_6
    if-ne v7, v6, :cond_7

    move v7, v9

    goto :goto_4

    :cond_7
    if-ne v7, v13, :cond_8

    move v7, v6

    goto :goto_4

    :cond_8
    if-ne v7, v5, :cond_9

    goto :goto_3

    :cond_9
    if-nez v7, :cond_79

    :goto_3
    if-eqz v10, :cond_a

    .line 28
    iget-object v7, v10, Lge4;->X:Ljava/util/List;

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lce4;

    .line 29
    iget-object v7, v7, Lce4;->a:Ljava/util/Locale;

    if-nez v7, :cond_b

    .line 30
    :cond_a
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    .line 31
    :cond_b
    invoke-static {v7}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v7

    if-eqz v7, :cond_3

    if-eq v7, v6, :cond_5

    goto :goto_2

    .line 32
    :goto_4
    iput v7, v0, Lkf;->n0:I

    const/4 v7, -0x1

    .line 33
    iput v7, v0, Lkf;->o0:I

    .line 34
    new-instance v10, Ljf;

    invoke-direct {v10, v0, v9}, Ljf;-><init>(Ljava/lang/Object;B)V

    .line 35
    iget-object v1, v1, Lxg5;->i:Le88;

    if-nez v1, :cond_c

    .line 36
    sget-object v1, Le88;->c:Le88;

    .line 37
    :cond_c
    iget-boolean v11, v1, Le88;->b:Z

    if-eqz v11, :cond_d

    .line 38
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v11

    or-int/lit16 v11, v11, 0x80

    goto :goto_5

    .line 39
    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v11

    and-int/lit16 v11, v11, -0x81

    .line 40
    :goto_5
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setFlags(I)V

    .line 41
    iget v1, v1, Le88;->a:I

    if-ne v1, v6, :cond_e

    .line 42
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x40

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 43
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_e
    if-ne v1, v13, :cond_f

    .line 44
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 45
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    :cond_f
    if-ne v1, v5, :cond_10

    .line 46
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 47
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setHinting(I)V

    goto :goto_6

    .line 48
    :cond_10
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 49
    :goto_6
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v1

    move v5, v9

    :goto_7
    if-ge v5, v1, :cond_12

    .line 50
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    .line 51
    move-object v14, v11

    check-cast v14, Lpl;

    .line 52
    iget-object v14, v14, Lpl;->a:Ljava/lang/Object;

    .line 53
    instance-of v14, v14, Lqe7;

    if-eqz v14, :cond_11

    goto :goto_8

    :cond_11
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_12
    const/4 v11, 0x0

    :goto_8
    if-eqz v11, :cond_13

    move v1, v6

    goto :goto_9

    :cond_13
    move v1, v9

    .line 54
    :goto_9
    iget-wide v14, v8, Lqe7;->b:J

    iget-object v2, v8, Lqe7;->c:Ldj2;

    iget-object v5, v8, Lqe7;->d:Lbj2;

    iget-object v11, v8, Lqe7;->g:Ljava/lang/String;

    const/16 p1, 0x0

    iget-object v12, v8, Lqe7;->k:Lge4;

    move/from16 p4, v6

    iget-object v6, v8, Lqe7;->a:Lf78;

    iget-object v13, v8, Lqe7;->j:Lg78;

    move-object/from16 p7, v10

    iget-wide v9, v8, Lqe7;->h:J

    move-object/from16 v16, v8

    .line 55
    invoke-static {v14, v15}, Lv88;->b(J)J

    move-result-wide v7

    move/from16 p3, v1

    move-object/from16 v18, v2

    const-wide v1, 0x100000000L

    .line 56
    invoke-static {v7, v8, v1, v2}, Lw88;->a(JJ)Z

    move-result v19

    const-wide v1, 0x200000000L

    if-eqz v19, :cond_15

    invoke-interface {v3, v14, v15}, Lfi1;->G0(J)F

    move-result v7

    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_14
    :goto_a
    move-object/from16 v7, v16

    goto :goto_b

    .line 57
    :cond_15
    invoke-static {v7, v8, v1, v2}, Lw88;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_14

    .line 58
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v7

    invoke-static {v14, v15}, Lv88;->c(J)F

    move-result v8

    mul-float/2addr v8, v7

    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_a

    .line 59
    :goto_b
    iget-object v8, v7, Lqe7;->f:Lgi2;

    if-nez v8, :cond_17

    if-nez v5, :cond_17

    if-eqz v18, :cond_16

    goto :goto_c

    :cond_16
    move-object/from16 v1, p7

    move-object/from16 v16, v6

    goto :goto_12

    :cond_17
    :goto_c
    if-nez v18, :cond_18

    .line 60
    sget-object v14, Ldj2;->g0:Ldj2;

    goto :goto_d

    :cond_18
    move-object/from16 v14, v18

    :goto_d
    if-eqz v5, :cond_19

    .line 61
    iget v5, v5, Lbj2;->a:I

    goto :goto_e

    :cond_19
    const/4 v5, 0x0

    .line 62
    :goto_e
    iget-object v15, v7, Lqe7;->e:Lcj2;

    if-eqz v15, :cond_1a

    .line 63
    iget v15, v15, Lcj2;->a:I

    :goto_f
    move-object/from16 v1, p7

    goto :goto_10

    :cond_1a
    const v15, 0xffff

    goto :goto_f

    .line 64
    :goto_10
    iget-object v2, v1, Ljf;->Y:Ljava/lang/Object;

    check-cast v2, Lkf;

    move-object/from16 v16, v6

    .line 65
    iget-object v6, v2, Lkf;->g0:Lfi2;

    check-cast v6, Lhi2;

    invoke-virtual {v6, v8, v14, v5, v15}, Lhi2;->b(Lgi2;Ldj2;II)Lrj8;

    move-result-object v5

    .line 66
    instance-of v6, v5, Lrj8;

    if-nez v6, :cond_1b

    .line 67
    new-instance v6, Lzv7;

    iget-object v8, v2, Lkf;->l0:Lzv7;

    invoke-direct {v6, v5, v8}, Lzv7;-><init>(Lrj8;Lzv7;)V

    .line 68
    iput-object v6, v2, Lkf;->l0:Lzv7;

    .line 69
    iget-object v2, v6, Lzv7;->Z:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Landroid/graphics/Typeface;

    goto :goto_11

    .line 70
    :cond_1b
    iget-object v2, v5, Lrj8;->X:Ljava/lang/Object;

    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Landroid/graphics/Typeface;

    .line 72
    :goto_11
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_12
    const/16 v2, 0xa

    if-eqz v12, :cond_1d

    .line 73
    sget-object v5, Lge4;->Z:Lge4;

    .line 74
    sget-object v5, Luo5;->a:Llr;

    .line 75
    invoke-virtual {v5}, Llr;->l()Lge4;

    move-result-object v5

    .line 76
    invoke-virtual {v12, v5}, Lge4;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1d

    .line 77
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v12, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    iget-object v6, v12, Lge4;->X:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 79
    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 80
    check-cast v8, Lce4;

    .line 81
    iget-object v8, v8, Lce4;->a:Ljava/util/Locale;

    .line 82
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1c
    const/4 v8, 0x0

    .line 83
    new-array v6, v8, [Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    .line 84
    check-cast v5, [Ljava/util/Locale;

    array-length v6, v5

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/util/Locale;

    new-instance v6, Landroid/os/LocaleList;

    invoke-direct {v6, v5}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 85
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    :cond_1d
    if-eqz v11, :cond_1e

    .line 86
    const-string v5, ""

    .line 87
    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    .line 88
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :cond_1e
    if-eqz v13, :cond_1f

    .line 89
    sget-object v5, Lg78;->c:Lg78;

    .line 90
    invoke-virtual {v13, v5}, Lg78;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1f

    .line 91
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v5

    .line 92
    iget v6, v13, Lg78;->a:F

    mul-float/2addr v5, v6

    .line 93
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 94
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v5

    .line 95
    iget v6, v13, Lg78;->b:F

    add-float/2addr v5, v6

    .line 96
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 97
    :cond_1f
    invoke-interface/range {v16 .. v16}, Lf78;->b()J

    move-result-wide v5

    .line 98
    invoke-virtual {v4, v5, v6}, Lph;->d(J)V

    .line 99
    invoke-interface/range {v16 .. v16}, Lf78;->c()Ld90;

    move-result-object v5

    const-wide v11, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 100
    invoke-interface/range {v16 .. v16}, Lf78;->a()F

    move-result v6

    .line 101
    invoke-virtual {v4, v5, v11, v12, v6}, Lph;->c(Ld90;JF)V

    .line 102
    iget-object v5, v7, Lqe7;->n:Lt67;

    .line 103
    invoke-virtual {v4, v5}, Lph;->f(Lt67;)V

    .line 104
    iget-object v5, v7, Lqe7;->m:Lx38;

    .line 105
    invoke-virtual {v4, v5}, Lph;->g(Lx38;)V

    .line 106
    iget-object v5, v7, Lqe7;->p:Ltv1;

    .line 107
    invoke-virtual {v4, v5}, Lph;->e(Ltv1;)V

    .line 108
    invoke-static {v9, v10}, Lv88;->b(J)J

    move-result-wide v5

    const-wide v11, 0x100000000L

    invoke-static {v5, v6, v11, v12}, Lw88;->a(JJ)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_22

    invoke-static {v9, v10}, Lv88;->c(J)F

    move-result v5

    cmpg-float v5, v5, v6

    if-nez v5, :cond_20

    goto :goto_14

    .line 109
    :cond_20
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v8

    mul-float/2addr v8, v5

    .line 110
    invoke-interface {v3, v9, v10}, Lfi1;->G0(J)F

    move-result v3

    cmpg-float v5, v8, v6

    if-nez v5, :cond_21

    goto :goto_15

    :cond_21
    div-float/2addr v3, v8

    .line 111
    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_15

    .line 112
    :cond_22
    :goto_14
    invoke-static {v9, v10}, Lv88;->b(J)J

    move-result-wide v11

    const-wide v13, 0x200000000L

    invoke-static {v11, v12, v13, v14}, Lw88;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_23

    .line 113
    invoke-static {v9, v10}, Lv88;->c(J)F

    move-result v3

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 114
    :cond_23
    :goto_15
    iget-wide v3, v7, Lqe7;->l:J

    .line 115
    iget-object v5, v7, Lqe7;->i:Lx20;

    if-eqz p3, :cond_25

    .line 116
    invoke-static {v9, v10}, Lv88;->b(J)J

    move-result-wide v7

    const-wide v11, 0x100000000L

    invoke-static {v7, v8, v11, v12}, Lw88;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_25

    invoke-static {v9, v10}, Lv88;->c(J)F

    move-result v7

    cmpg-float v7, v7, v6

    if-nez v7, :cond_24

    goto :goto_16

    :cond_24
    move/from16 v7, p4

    goto :goto_17

    :cond_25
    :goto_16
    const/4 v7, 0x0

    .line 117
    :goto_17
    sget-wide v11, Ldw0;->g:J

    .line 118
    invoke-static {v3, v4, v11, v12}, Ltk8;->a(JJ)Z

    move-result v8

    if-nez v8, :cond_26

    .line 119
    sget-wide v13, Ldw0;->f:J

    .line 120
    invoke-static {v3, v4, v13, v14}, Ltk8;->a(JJ)Z

    move-result v8

    if-nez v8, :cond_26

    move/from16 v8, p4

    goto :goto_18

    :cond_26
    const/4 v8, 0x0

    :goto_18
    if-eqz v5, :cond_28

    .line 121
    iget v13, v5, Lx20;->a:F

    .line 122
    invoke-static {v13, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v13

    if-nez v13, :cond_27

    goto :goto_19

    :cond_27
    move/from16 v13, p4

    goto :goto_1a

    :cond_28
    :goto_19
    const/4 v13, 0x0

    :goto_1a
    if-nez v7, :cond_29

    if-nez v8, :cond_29

    if-nez v13, :cond_29

    move-object/from16 v3, p1

    goto :goto_1f

    :cond_29
    if-eqz v7, :cond_2a

    :goto_1b
    move-wide/from16 v30, v9

    goto :goto_1c

    .line 123
    :cond_2a
    sget-wide v9, Lv88;->c:J

    goto :goto_1b

    :goto_1c
    if-eqz v8, :cond_2b

    move-wide/from16 v35, v3

    goto :goto_1d

    :cond_2b
    move-wide/from16 v35, v11

    :goto_1d
    if-eqz v13, :cond_2c

    move-object/from16 v32, v5

    goto :goto_1e

    :cond_2c
    move-object/from16 v32, p1

    .line 124
    :goto_1e
    new-instance v20, Lqe7;

    const/16 v38, 0x0

    const v39, 0xf67f

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v20 .. v39}, Lqe7;-><init>(JJLdj2;Lbj2;Lcj2;Lgi2;Ljava/lang/String;JLx20;Lg78;Lge4;JLx38;Lt67;I)V

    move-object/from16 v3, v20

    .line 125
    :goto_1f
    iget-object v4, v0, Lkf;->Z:Ljava/util/List;

    if-eqz v3, :cond_2f

    .line 126
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    :goto_20
    if-ge v7, v4, :cond_2e

    if-nez v7, :cond_2d

    .line 127
    new-instance v8, Lpl;

    .line 128
    iget-object v9, v0, Lkf;->X:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x0

    .line 129
    invoke-direct {v8, v10, v9, v3}, Lpl;-><init>(IILjava/lang/Object;)V

    goto :goto_21

    .line 130
    :cond_2d
    iget-object v8, v0, Lkf;->Z:Ljava/util/List;

    add-int/lit8 v9, v7, -0x1

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpl;

    .line 131
    :goto_21
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_20

    :cond_2e
    move-object v4, v5

    .line 132
    :cond_2f
    iget-object v3, v0, Lkf;->X:Ljava/lang/String;

    .line 133
    iget-object v5, v0, Lkf;->i0:Lph;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getTextSize()F

    move-result v5

    .line 134
    iget-object v7, v0, Lkf;->Y:Lo88;

    .line 135
    iget-object v8, v0, Lkf;->f0:Ljava/util/List;

    .line 136
    iget-object v12, v0, Lkf;->h0:Lfi1;

    .line 137
    iget-boolean v9, v0, Lkf;->m0:Z

    .line 138
    iget-object v10, v0, Lkf;->X:Ljava/lang/String;

    iget v11, v0, Lkf;->o0:I

    const/4 v13, -0x1

    if-ne v11, v13, :cond_32

    .line 139
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    const/16 v13, 0x200

    if-gt v11, v13, :cond_31

    invoke-static {v10, v2}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    move-result v10

    if-eqz v10, :cond_30

    goto :goto_22

    :cond_30
    const/4 v10, 0x0

    goto :goto_23

    :cond_31
    :goto_22
    move/from16 v10, p4

    .line 140
    :goto_23
    iput v10, v0, Lkf;->o0:I

    .line 141
    :cond_32
    sget-object v10, Lhf;->a:Lgf;

    if-eqz v9, :cond_36

    .line 142
    invoke-static {}, Lyy1;->d()Z

    move-result v9

    if-eqz v9, :cond_36

    .line 143
    iget-object v9, v7, Lo88;->c:Lup5;

    if-eqz v9, :cond_33

    .line 144
    iget-object v9, v9, Lup5;->b:Lfp5;

    if-eqz v9, :cond_33

    .line 145
    iget v9, v9, Lfp5;->b:I

    .line 146
    new-instance v10, Lnz1;

    invoke-direct {v10, v9}, Lnz1;-><init>(I)V

    goto :goto_24

    :cond_33
    move-object/from16 v10, p1

    :goto_24
    if-nez v10, :cond_35

    :cond_34
    const/4 v9, 0x0

    goto :goto_25

    .line 147
    :cond_35
    iget v9, v10, Lnz1;->a:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_34

    move/from16 v9, p4

    .line 148
    :goto_25
    invoke-static {}, Lyy1;->a()Lyy1;

    move-result-object v10

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v13, 0x0

    invoke-virtual {v10, v13, v11, v9, v3}, Lyy1;->g(IIILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_26

    :cond_36
    move-object v9, v3

    .line 149
    :goto_26
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v10

    const-wide/16 v13, 0x0

    const-wide v15, 0xff00000000L

    if-eqz v10, :cond_37

    .line 150
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_37

    .line 151
    iget-object v10, v7, Lo88;->b:Lxg5;

    .line 152
    iget-object v10, v10, Lxg5;->d:Li78;

    .line 153
    sget-object v11, Li78;->c:Li78;

    .line 154
    invoke-static {v10, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_37

    .line 155
    iget-object v10, v7, Lo88;->b:Lxg5;

    .line 156
    iget-wide v10, v10, Lxg5;->c:J

    and-long/2addr v10, v15

    cmp-long v10, v10, v13

    if-nez v10, :cond_37

    goto/16 :goto_51

    .line 157
    :cond_37
    instance-of v10, v9, Landroid/text/Spannable;

    if-eqz v10, :cond_38

    .line 158
    check-cast v9, Landroid/text/Spannable;

    goto :goto_27

    .line 159
    :cond_38
    new-instance v10, Landroid/text/SpannableString;

    invoke-direct {v10, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v9, v10

    .line 160
    :goto_27
    iget-object v10, v7, Lo88;->a:Lqe7;

    iget-object v11, v7, Lo88;->b:Lxg5;

    move/from16 p2, v6

    .line 161
    iget-object v6, v10, Lqe7;->m:Lx38;

    move-wide/from16 p6, v13

    .line 162
    sget-object v13, Lx38;->c:Lx38;

    .line 163
    invoke-static {v6, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/16 v13, 0x21

    if-eqz v6, :cond_39

    .line 164
    sget-object v6, Lhf;->a:Lgf;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v14, 0x0

    .line 165
    invoke-interface {v9, v6, v14, v3, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 166
    :cond_39
    iget-object v3, v7, Lo88;->c:Lup5;

    if-eqz v3, :cond_3a

    .line 167
    iget-object v3, v3, Lup5;->b:Lfp5;

    if-eqz v3, :cond_3a

    .line 168
    iget-boolean v3, v3, Lfp5;->a:Z

    goto :goto_28

    :cond_3a
    const/4 v3, 0x0

    :goto_28
    if-eqz v3, :cond_3c

    .line 169
    iget-object v3, v11, Lxg5;->f:Laa4;

    if-nez v3, :cond_3c

    .line 170
    iget-wide v2, v11, Lxg5;->c:J

    .line 171
    invoke-static {v2, v3, v5, v12}, Ldh3;->H(JFLfi1;)F

    move-result v2

    .line 172
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_3b

    .line 173
    new-instance v3, Lw94;

    invoke-direct {v3, v2}, Lw94;-><init>(F)V

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v14, 0x0

    .line 174
    invoke-interface {v9, v3, v14, v2, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_3b
    const/4 v14, 0x0

    goto :goto_2e

    .line 175
    :cond_3c
    iget-object v3, v11, Lxg5;->f:Laa4;

    if-nez v3, :cond_3d

    .line 176
    sget-object v3, Laa4;->d:Laa4;

    .line 177
    :cond_3d
    iget-wide v6, v11, Lxg5;->c:J

    .line 178
    invoke-static {v6, v7, v5, v12}, Ldh3;->H(JFLfi1;)F

    move-result v21

    .line 179
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_3b

    .line 180
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_3e

    goto :goto_29

    :cond_3e
    invoke-static {v9}, Lfm7;->p0(Ljava/lang/CharSequence;)C

    move-result v6

    if-ne v6, v2, :cond_3f

    :goto_29
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    :goto_2a
    move/from16 v22, v2

    goto :goto_2b

    :cond_3f
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v2

    goto :goto_2a

    .line 181
    :goto_2b
    new-instance v20, Lba4;

    .line 182
    iget v2, v3, Laa4;->b:I

    and-int/lit8 v6, v2, 0x1

    if-lez v6, :cond_40

    move/from16 v23, p4

    goto :goto_2c

    :cond_40
    const/16 v23, 0x0

    :goto_2c
    and-int/lit8 v2, v2, 0x10

    if-lez v2, :cond_41

    move/from16 v24, p4

    goto :goto_2d

    :cond_41
    const/16 v24, 0x0

    .line 183
    :goto_2d
    iget v2, v3, Laa4;->a:F

    .line 184
    iget v3, v3, Laa4;->c:I

    move/from16 v25, v2

    move/from16 v26, v3

    .line 185
    invoke-direct/range {v20 .. v26}, Lba4;-><init>(FIZZFI)V

    move-object/from16 v2, v20

    .line 186
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v14, 0x0

    .line 187
    invoke-interface {v9, v2, v14, v3, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 188
    :goto_2e
    iget-object v2, v11, Lxg5;->d:Li78;

    if-eqz v2, :cond_43

    .line 189
    iget-wide v6, v2, Li78;->a:J

    iget-wide v2, v2, Li78;->b:J

    move/from16 p5, v14

    move-wide/from16 v20, v15

    .line 190
    invoke-static/range {p5 .. p5}, Leu7;->g(I)J

    move-result-wide v14

    invoke-static {v6, v7, v14, v15}, Lv88;->a(JJ)Z

    move-result v14

    if-eqz v14, :cond_42

    invoke-static/range {p5 .. p5}, Leu7;->g(I)J

    move-result-wide v14

    invoke-static {v2, v3, v14, v15}, Lv88;->a(JJ)Z

    move-result v14

    if-nez v14, :cond_43

    :cond_42
    and-long v14, v6, v20

    cmp-long v14, v14, p6

    if-nez v14, :cond_44

    :cond_43
    :goto_2f
    move-object/from16 p7, v1

    goto/16 :goto_32

    :cond_44
    and-long v14, v2, v20

    cmp-long v14, v14, p6

    if-nez v14, :cond_45

    goto :goto_2f

    .line 191
    :cond_45
    invoke-static {v6, v7}, Lv88;->b(J)J

    move-result-wide v14

    move-object/from16 p7, v1

    const-wide v0, 0x100000000L

    .line 192
    invoke-static {v14, v15, v0, v1}, Lw88;->a(JJ)Z

    move-result v16

    if-eqz v16, :cond_46

    invoke-interface {v12, v6, v7}, Lfi1;->G0(J)F

    move-result v6

    const-wide v0, 0x200000000L

    goto :goto_30

    :cond_46
    const-wide v0, 0x200000000L

    .line 193
    invoke-static {v14, v15, v0, v1}, Lw88;->a(JJ)Z

    move-result v14

    if-eqz v14, :cond_47

    invoke-static {v6, v7}, Lv88;->c(J)F

    move-result v6

    mul-float/2addr v6, v5

    goto :goto_30

    :cond_47
    move/from16 v6, p2

    .line 194
    :goto_30
    invoke-static {v2, v3}, Lv88;->b(J)J

    move-result-wide v14

    const-wide v0, 0x100000000L

    .line 195
    invoke-static {v14, v15, v0, v1}, Lw88;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_48

    invoke-interface {v12, v2, v3}, Lfi1;->G0(J)F

    move-result v0

    goto :goto_31

    :cond_48
    const-wide v0, 0x200000000L

    .line 196
    invoke-static {v14, v15, v0, v1}, Lw88;->a(JJ)Z

    move-result v7

    if-eqz v7, :cond_49

    invoke-static {v2, v3}, Lv88;->c(J)F

    move-result v0

    mul-float/2addr v0, v5

    goto :goto_31

    :cond_49
    move/from16 v0, p2

    .line 197
    :goto_31
    new-instance v1, Landroid/text/style/LeadingMarginSpan$Standard;

    float-to-double v2, v6

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    float-to-double v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v0, v5

    float-to-int v0, v0

    invoke-direct {v1, v2, v0}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 198
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v14, 0x0

    .line 199
    invoke-interface {v9, v1, v14, v0, v13}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 200
    :goto_32
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 201
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_33
    if-ge v2, v1, :cond_4d

    .line 202
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 203
    check-cast v3, Lpl;

    .line 204
    iget-object v5, v3, Lpl;->a:Ljava/lang/Object;

    .line 205
    instance-of v6, v5, Lqe7;

    if-eqz v6, :cond_4c

    move-object v6, v5

    check-cast v6, Lqe7;

    .line 206
    iget-object v7, v6, Lqe7;->f:Lgi2;

    if-nez v7, :cond_4b

    .line 207
    iget-object v7, v6, Lqe7;->d:Lbj2;

    if-nez v7, :cond_4b

    .line 208
    iget-object v6, v6, Lqe7;->c:Ldj2;

    if-eqz v6, :cond_4a

    goto :goto_34

    .line 209
    :cond_4a
    check-cast v5, Lqe7;

    .line 210
    iget-object v5, v5, Lqe7;->e:Lcj2;

    if-eqz v5, :cond_4c

    .line 211
    :cond_4b
    :goto_34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4c
    add-int/lit8 v2, v2, 0x1

    goto :goto_33

    .line 212
    :cond_4d
    iget-object v1, v10, Lqe7;->f:Lgi2;

    if-nez v1, :cond_50

    .line 213
    iget-object v2, v10, Lqe7;->d:Lbj2;

    if-nez v2, :cond_50

    .line 214
    iget-object v2, v10, Lqe7;->c:Ldj2;

    if-eqz v2, :cond_4e

    goto :goto_35

    .line 215
    :cond_4e
    iget-object v2, v10, Lqe7;->e:Lcj2;

    if-eqz v2, :cond_4f

    goto :goto_35

    :cond_4f
    move-object/from16 v1, p1

    goto :goto_36

    .line 216
    :cond_50
    :goto_35
    iget-object v2, v10, Lqe7;->c:Ldj2;

    .line 217
    iget-object v3, v10, Lqe7;->d:Lbj2;

    .line 218
    iget-object v5, v10, Lqe7;->e:Lcj2;

    .line 219
    new-instance v20, Lqe7;

    const/16 v38, 0x0

    const v39, 0xffc3

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v28, v1

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v27, v5

    invoke-direct/range {v20 .. v39}, Lqe7;-><init>(JJLdj2;Lbj2;Lcj2;Lgi2;Ljava/lang/String;JLx20;Lg78;Lge4;JLx38;Lt67;I)V

    move-object/from16 v1, v20

    .line 220
    :goto_36
    new-instance v2, Lo90;

    const/16 v3, 0xe

    move-object/from16 v5, p7

    invoke-direct {v2, v9, v5, v3}, Lo90;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 221
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move/from16 v5, p4

    if-gt v3, v5, :cond_52

    .line 222
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5a

    const/4 v14, 0x0

    .line 223
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpl;

    .line 224
    iget-object v3, v3, Lpl;->a:Ljava/lang/Object;

    .line 225
    check-cast v3, Lqe7;

    if-nez v1, :cond_51

    goto :goto_37

    .line 226
    :cond_51
    invoke-virtual {v1, v3}, Lqe7;->c(Lqe7;)Lqe7;

    move-result-object v3

    .line 227
    :goto_37
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpl;

    .line 228
    iget v1, v1, Lpl;->b:I

    .line 229
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 230
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpl;

    .line 231
    iget v0, v0, Lpl;->c:I

    .line 232
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 233
    invoke-virtual {v2, v3, v1, v0}, Lo90;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_3e

    .line 234
    :cond_52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    mul-int/lit8 v5, v3, 0x2

    .line 235
    new-array v6, v5, [I

    .line 236
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v10, 0x0

    :goto_38
    if-ge v10, v7, :cond_53

    .line 237
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 238
    check-cast v14, Lpl;

    .line 239
    iget v15, v14, Lpl;->b:I

    .line 240
    aput v15, v6, v10

    add-int v15, v10, v3

    .line 241
    iget v14, v14, Lpl;->c:I

    .line 242
    aput v14, v6, v15

    add-int/lit8 v10, v10, 0x1

    goto :goto_38

    :cond_53
    const/4 v10, 0x1

    if-le v5, v10, :cond_54

    .line 243
    invoke-static {v6}, Ljava/util/Arrays;->sort([I)V

    :cond_54
    if-eqz v5, :cond_78

    const/4 v14, 0x0

    .line 244
    aget v3, v6, v14

    move v7, v3

    const/4 v3, 0x0

    :goto_39
    if-ge v3, v5, :cond_5a

    .line 245
    aget v10, v6, v3

    if-ne v10, v7, :cond_55

    move-object/from16 p6, v0

    move-object/from16 p7, v1

    move/from16 v16, v3

    goto :goto_3d

    .line 246
    :cond_55
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v14

    move-object v13, v1

    const/4 v15, 0x0

    :goto_3a
    if-ge v15, v14, :cond_58

    .line 247
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p6, v0

    .line 248
    move-object/from16 v0, v16

    check-cast v0, Lpl;

    move-object/from16 p7, v1

    .line 249
    iget v1, v0, Lpl;->b:I

    move/from16 v16, v3

    .line 250
    iget v3, v0, Lpl;->c:I

    if-eq v1, v3, :cond_57

    .line 251
    invoke-static {v7, v10, v1, v3}, Lrl;->b(IIII)Z

    move-result v1

    if-eqz v1, :cond_57

    .line 252
    iget-object v0, v0, Lpl;->a:Ljava/lang/Object;

    .line 253
    check-cast v0, Lqe7;

    if-nez v13, :cond_56

    :goto_3b
    move-object v13, v0

    goto :goto_3c

    .line 254
    :cond_56
    invoke-virtual {v13, v0}, Lqe7;->c(Lqe7;)Lqe7;

    move-result-object v0

    goto :goto_3b

    :cond_57
    :goto_3c
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p6

    move-object/from16 v1, p7

    move/from16 v3, v16

    goto :goto_3a

    :cond_58
    move-object/from16 p6, v0

    move-object/from16 p7, v1

    move/from16 v16, v3

    if-eqz v13, :cond_59

    .line 255
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v13, v0, v1}, Lo90;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_59
    move v7, v10

    :goto_3d
    add-int/lit8 v3, v16, 0x1

    move-object/from16 v0, p6

    move-object/from16 v1, p7

    const/16 v13, 0x21

    goto :goto_39

    .line 256
    :cond_5a
    :goto_3e
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_3f
    if-ge v1, v0, :cond_6b

    .line 257
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpl;

    .line 258
    iget-object v5, v3, Lpl;->a:Ljava/lang/Object;

    .line 259
    instance-of v6, v5, Lqe7;

    if-eqz v6, :cond_5b

    .line 260
    iget v13, v3, Lpl;->b:I

    .line 261
    iget v14, v3, Lpl;->c:I

    if-ltz v13, :cond_5b

    .line 262
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v13, v3, :cond_5b

    if-le v14, v13, :cond_5b

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v14, v3, :cond_5c

    :cond_5b
    move/from16 p6, v0

    move/from16 v22, v1

    move/from16 p7, v2

    goto/16 :goto_49

    .line 263
    :cond_5c
    check-cast v5, Lqe7;

    iget-wide v6, v5, Lqe7;->h:J

    .line 264
    iget-object v3, v5, Lqe7;->i:Lx20;

    iget-object v10, v5, Lqe7;->a:Lf78;

    if-eqz v3, :cond_5d

    .line 265
    iget v3, v3, Lx20;->a:F

    .line 266
    new-instance v15, Ly20;

    move/from16 p6, v0

    const/4 v0, 0x0

    invoke-direct {v15, v3, v0}, Ly20;-><init>(FB)V

    const/16 v0, 0x21

    .line 267
    invoke-interface {v9, v15, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_40
    move v3, v1

    goto :goto_41

    :cond_5d
    move/from16 p6, v0

    goto :goto_40

    .line 268
    :goto_41
    invoke-interface {v10}, Lf78;->b()J

    move-result-wide v0

    .line 269
    invoke-static {v9, v0, v1, v13, v14}, Ldh3;->J(Landroid/text/Spannable;JII)V

    .line 270
    invoke-interface {v10}, Lf78;->c()Ld90;

    move-result-object v0

    .line 271
    invoke-interface {v10}, Lf78;->a()F

    move-result v1

    if-eqz v0, :cond_5f

    .line 272
    instance-of v10, v0, Lfe7;

    if-eqz v10, :cond_5e

    .line 273
    check-cast v0, Lfe7;

    .line 274
    iget-wide v0, v0, Lfe7;->a:J

    .line 275
    invoke-static {v9, v0, v1, v13, v14}, Ldh3;->J(Landroid/text/Spannable;JII)V

    goto :goto_42

    .line 276
    :cond_5e
    new-instance v10, Lr67;

    check-cast v0, Lq67;

    invoke-direct {v10, v0, v1}, Lr67;-><init>(Lq67;F)V

    const/16 v0, 0x21

    .line 277
    invoke-interface {v9, v10, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 278
    :cond_5f
    :goto_42
    iget-object v0, v5, Lqe7;->m:Lx38;

    if-eqz v0, :cond_62

    .line 279
    iget v0, v0, Lx38;->a:I

    .line 280
    new-instance v1, Ly38;

    or-int/lit8 v10, v0, 0x1

    if-ne v10, v0, :cond_60

    const/4 v10, 0x1

    goto :goto_43

    :cond_60
    const/4 v10, 0x0

    :goto_43
    or-int/lit8 v15, v0, 0x2

    if-ne v15, v0, :cond_61

    const/4 v0, 0x1

    goto :goto_44

    :cond_61
    const/4 v0, 0x0

    :goto_44
    invoke-direct {v1, v10, v0}, Ly38;-><init>(ZZ)V

    const/16 v0, 0x21

    .line 281
    invoke-interface {v9, v1, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_45
    move-object v1, v11

    goto :goto_46

    :cond_62
    const/16 v0, 0x21

    goto :goto_45

    .line 282
    :goto_46
    iget-wide v10, v5, Lqe7;->b:J

    .line 283
    invoke-static/range {v9 .. v14}, Ldh3;->K(Landroid/text/Spannable;JLfi1;II)V

    .line 284
    iget-object v10, v5, Lqe7;->g:Ljava/lang/String;

    if-eqz v10, :cond_63

    .line 285
    new-instance v11, Lji2;

    const/4 v15, 0x0

    invoke-direct {v11, v10, v15}, Lji2;-><init>(Ljava/lang/Object;B)V

    .line 286
    invoke-interface {v9, v11, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 287
    :cond_63
    iget-object v10, v5, Lqe7;->j:Lg78;

    if-eqz v10, :cond_64

    .line 288
    new-instance v11, Landroid/text/style/ScaleXSpan;

    .line 289
    iget v15, v10, Lg78;->a:F

    .line 290
    invoke-direct {v11, v15}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 291
    invoke-interface {v9, v11, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 292
    new-instance v11, Ly20;

    .line 293
    iget v10, v10, Lg78;->b:F

    const/4 v15, 0x1

    .line 294
    invoke-direct {v11, v10, v15}, Ly20;-><init>(FB)V

    .line 295
    invoke-interface {v9, v11, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_47

    :cond_64
    const/4 v15, 0x1

    .line 296
    :goto_47
    iget-object v10, v5, Lqe7;->k:Lge4;

    .line 297
    invoke-static {v9, v10, v13, v14}, Ldh3;->L(Landroid/text/Spannable;Lge4;II)V

    .line 298
    iget-wide v10, v5, Lqe7;->l:J

    const-wide/16 v16, 0x10

    cmp-long v16, v10, v16

    if-eqz v16, :cond_65

    .line 299
    new-instance v15, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v10, v11}, Lz51;->U(J)I

    move-result v10

    invoke-direct {v15, v10}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 300
    invoke-interface {v9, v15, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 301
    :cond_65
    iget-object v10, v5, Lqe7;->n:Lt67;

    if-eqz v10, :cond_67

    move-object v11, v1

    .line 302
    iget-wide v0, v10, Lt67;->b:J

    .line 303
    new-instance v15, Lw67;

    move-wide/from16 v16, v0

    .line 304
    iget-wide v0, v10, Lt67;->a:J

    .line 305
    invoke-static {v0, v1}, Lz51;->U(J)I

    move-result v0

    const/16 v1, 0x20

    move/from16 p7, v2

    shr-long v1, v16, v1

    long-to-int v1, v1

    .line 306
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const-wide v20, 0xffffffffL

    move/from16 v22, v3

    and-long v2, v16, v20

    long-to-int v2, v2

    .line 307
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 308
    iget v3, v10, Lt67;->c:F

    cmpg-float v10, v3, p2

    if-nez v10, :cond_66

    const/4 v3, 0x1

    .line 309
    :cond_66
    invoke-direct {v15, v1, v2, v3, v0}, Lw67;-><init>(FFFI)V

    const/16 v0, 0x21

    .line 310
    invoke-interface {v9, v15, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_48

    :cond_67
    move-object v11, v1

    move/from16 p7, v2

    move/from16 v22, v3

    .line 311
    :goto_48
    iget-object v1, v5, Lqe7;->p:Ltv1;

    if-eqz v1, :cond_68

    .line 312
    new-instance v2, Luv1;

    invoke-direct {v2, v1}, Luv1;-><init>(Ltv1;)V

    .line 313
    invoke-interface {v9, v2, v13, v14, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 314
    :cond_68
    invoke-static {v6, v7}, Lv88;->b(J)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    invoke-static {v0, v1, v2, v3}, Lw88;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_69

    invoke-static {v6, v7}, Lv88;->b(J)J

    move-result-wide v0

    const-wide v13, 0x200000000L

    invoke-static {v0, v1, v13, v14}, Lw88;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_6a

    :cond_69
    const/4 v2, 0x1

    goto :goto_4a

    :cond_6a
    :goto_49
    move/from16 v2, p7

    :goto_4a
    add-int/lit8 v1, v22, 0x1

    move/from16 v0, p6

    goto/16 :goto_3f

    :cond_6b
    move/from16 p7, v2

    if-eqz p7, :cond_71

    .line 315
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_4b
    if-ge v1, v0, :cond_71

    .line 316
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpl;

    .line 317
    iget-object v3, v2, Lpl;->a:Ljava/lang/Object;

    .line 318
    check-cast v3, Lml;

    .line 319
    instance-of v5, v3, Lqe7;

    if-eqz v5, :cond_6c

    .line 320
    iget v5, v2, Lpl;->b:I

    .line 321
    iget v2, v2, Lpl;->c:I

    if-ltz v5, :cond_6c

    .line 322
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v5, v6, :cond_6c

    if-le v2, v5, :cond_6c

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-le v2, v6, :cond_6d

    :cond_6c
    move/from16 p2, v0

    move v3, v1

    const/16 v1, 0x21

    goto :goto_4d

    .line 323
    :cond_6d
    check-cast v3, Lqe7;

    .line 324
    iget-wide v6, v3, Lqe7;->h:J

    .line 325
    invoke-static {v6, v7}, Lv88;->b(J)J

    move-result-wide v13

    move/from16 p2, v0

    move v3, v1

    const-wide v0, 0x100000000L

    .line 326
    invoke-static {v13, v14, v0, v1}, Lw88;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_6e

    new-instance v0, Lk84;

    invoke-interface {v12, v6, v7}, Lfi1;->G0(J)F

    move-result v1

    invoke-direct {v0, v1}, Lk84;-><init>(F)V

    goto :goto_4c

    :cond_6e
    const-wide v0, 0x200000000L

    .line 327
    invoke-static {v13, v14, v0, v1}, Lw88;->a(JJ)Z

    move-result v10

    if-eqz v10, :cond_6f

    .line 328
    new-instance v0, Lj84;

    invoke-static {v6, v7}, Lv88;->c(J)F

    move-result v1

    invoke-direct {v0, v1}, Lj84;-><init>(F)V

    goto :goto_4c

    :cond_6f
    move-object/from16 v0, p1

    :goto_4c
    const/16 v1, 0x21

    if-eqz v0, :cond_70

    .line 329
    invoke-interface {v9, v0, v5, v2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_70
    :goto_4d
    add-int/lit8 v0, v3, 0x1

    move v1, v0

    move/from16 v0, p2

    goto :goto_4b

    :cond_71
    move-object v1, v11

    .line 330
    iget-object v0, v1, Lxg5;->d:Li78;

    if-eqz v0, :cond_73

    .line 331
    iget-wide v0, v0, Li78;->a:J

    .line 332
    invoke-static {v0, v1}, Lv88;->b(J)J

    move-result-wide v2

    const-wide v5, 0x100000000L

    .line 333
    invoke-static {v2, v3, v5, v6}, Lw88;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_72

    invoke-interface {v12, v0, v1}, Lfi1;->G0(J)F

    goto :goto_4e

    :cond_72
    const-wide v13, 0x200000000L

    .line 334
    invoke-static {v2, v3, v13, v14}, Lw88;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_73

    invoke-static {v0, v1}, Lv88;->c(J)F

    .line 335
    :cond_73
    :goto_4e
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_4f
    if-ge v1, v0, :cond_74

    .line 336
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 337
    check-cast v2, Lpl;

    .line 338
    iget-object v2, v2, Lpl;->a:Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4f

    .line 339
    :cond_74
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_77

    const/4 v14, 0x0

    .line 340
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 341
    check-cast v0, Lpl;

    .line 342
    iget-object v1, v0, Lpl;->a:Ljava/lang/Object;

    if-nez v1, :cond_76

    .line 343
    iget v1, v0, Lpl;->b:I

    .line 344
    iget v0, v0, Lpl;->c:I

    .line 345
    const-class v2, Lpj8;

    invoke-interface {v9, v1, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    .line 346
    array-length v1, v0

    :goto_50
    if-ge v14, v1, :cond_75

    aget-object v2, v0, v14

    check-cast v2, Lpj8;

    .line 347
    invoke-interface {v9, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_50

    .line 348
    :cond_75
    new-instance v0, Lio5;

    .line 349
    throw p1

    .line 350
    :cond_76
    invoke-static {}, Lio/sentry/c2;->m()V

    throw p1

    :cond_77
    move-object/from16 v0, p0

    .line 351
    :goto_51
    iput-object v9, v0, Lkf;->j0:Ljava/lang/CharSequence;

    .line 352
    new-instance v1, Le34;

    iget-object v2, v0, Lkf;->i0:Lph;

    iget v3, v0, Lkf;->n0:I

    invoke-direct {v1, v9, v2, v3}, Le34;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object v1, v0, Lkf;->k0:Le34;

    return-void

    .line 353
    :cond_78
    const-string v0, "Array is empty."

    invoke-static {v0}, Lem7;->g(Ljava/lang/String;)V

    throw p1

    :cond_79
    const/16 p1, 0x0

    .line 354
    const-string v0, "Invalid TextDirection."

    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lkf;->l0:Lzv7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lzv7;->p()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, Lkf;->m0:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object p0, p0, Lkf;->Y:Lo88;

    .line 19
    .line 20
    invoke-static {p0}, Lz39;->w(Lo88;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    sget-object p0, Ldz1;->a:Lwl6;

    .line 27
    .line 28
    sget-object p0, Ldz1;->a:Lwl6;

    .line 29
    .line 30
    iget-object v0, p0, Lwl6;->Y:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Llh7;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {}, Lyy1;->d()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Lwl6;->O()Llh7;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lwl6;->Y:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    sget-object v0, Lyn0;->c:Lw73;

    .line 51
    .line 52
    :goto_1
    invoke-interface {v0}, Llh7;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    return v1

    .line 66
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final h()F
    .locals 10

    .line 1
    iget-object p0, p0, Lkf;->k0:Le34;

    .line 2
    .line 3
    iget v0, p0, Le34;->e:F

    .line 4
    .line 5
    iget-object v1, p0, Le34;->b:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Le34;->e:F

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v2, Lcq0;

    .line 25
    .line 26
    iget-object v3, p0, Le34;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {v2, v3, v4}, Lcq0;-><init>(Ljava/lang/CharSequence;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/util/PriorityQueue;

    .line 39
    .line 40
    sget-object v3, Lwl7;->c:Lcg;

    .line 41
    .line 42
    const/16 v4, 0xa

    .line 43
    .line 44
    invoke-direct {v2, v4, v3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v5, 0x0

    .line 52
    :goto_0
    const/4 v6, -0x1

    .line 53
    if-eq v3, v6, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->size()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/4 v7, 0x1

    .line 60
    if-ge v6, v4, :cond_1

    .line 61
    .line 62
    new-instance v6, Lkf3;

    .line 63
    .line 64
    invoke-direct {v6, v5, v3, v7}, Lif3;-><init>(III)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Lkf3;

    .line 76
    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    iget v8, v6, Lif3;->Y:I

    .line 80
    .line 81
    iget v6, v6, Lif3;->X:I

    .line 82
    .line 83
    sub-int/2addr v8, v6

    .line 84
    sub-int v6, v3, v5

    .line 85
    .line 86
    if-ge v8, v6, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    new-instance v6, Lkf3;

    .line 92
    .line 93
    invoke-direct {v6, v5, v3, v7}, Lif3;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/text/BreakIterator;->next()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    move v9, v5

    .line 104
    move v5, v3

    .line 105
    move v3, v9

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    const/4 v3, 0x0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-virtual {v2}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Lkf3;

    .line 130
    .line 131
    iget v3, v2, Lif3;->X:I

    .line 132
    .line 133
    iget v2, v2, Lif3;->Y:I

    .line 134
    .line 135
    invoke-virtual {p0}, Le34;->b()Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4, v3, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    move v3, v2

    .line 144
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_5

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, Lkf3;

    .line 155
    .line 156
    iget v4, v2, Lif3;->X:I

    .line 157
    .line 158
    iget v2, v2, Lif3;->Y:I

    .line 159
    .line 160
    invoke-virtual {p0}, Le34;->b()Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v5, v4, v2, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    goto :goto_2

    .line 173
    :cond_5
    :goto_3
    iput v3, p0, Le34;->e:F

    .line 174
    .line 175
    return v3

    .line 176
    :cond_6
    invoke-static {}, Lbt;->n()V

    .line 177
    .line 178
    .line 179
    return v3
.end method

.method public final l()F
    .locals 0

    .line 1
    iget-object p0, p0, Lkf;->k0:Le34;

    .line 2
    .line 3
    invoke-virtual {p0}, Le34;->c()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
