.class public final Las1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Ljava/util/List;

.field public final synthetic j0:Ljava/util/ArrayList;

.field public final synthetic k0:I

.field public final synthetic l0:S

.field public final synthetic m0:Lgn2;

.field public final synthetic n0:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;IJLgn2;Ljava/util/LinkedHashMap;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Las1;->i0:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Las1;->j0:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput p3, p0, Las1;->k0:I

    .line 6
    .line 7
    long-to-int p1, p4

    .line 8
    iput-short p1, p0, Las1;->l0:S

    .line 9
    .line 10
    iput-object p6, p0, Las1;->m0:Lgn2;

    .line 11
    .line 12
    iput-object p7, p0, Las1;->n0:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p8}, Luy7;-><init>(ILq51;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Las1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Las1;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Las1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 9

    .line 1
    new-instance v0, Las1;

    .line 2
    .line 3
    iget-short v1, p0, Las1;->l0:S

    .line 4
    .line 5
    int-to-long v4, v1

    .line 6
    iget-object v6, p0, Las1;->m0:Lgn2;

    .line 7
    .line 8
    iget-object v7, p0, Las1;->n0:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    iget-object v1, p0, Las1;->i0:Ljava/util/List;

    .line 11
    .line 12
    iget-object v2, p0, Las1;->j0:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget v3, p0, Las1;->k0:I

    .line 15
    .line 16
    move-object v8, p1

    .line 17
    invoke-direct/range {v0 .. v8}, Las1;-><init>(Ljava/util/List;Ljava/util/ArrayList;IJLgn2;Ljava/util/LinkedHashMap;Lq51;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, v0, Las1;->h0:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Las1;->h0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lb71;

    .line 6
    .line 7
    iget-boolean v2, v0, Las1;->g0:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v4, :cond_0

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-short v2, v0, Las1;->l0:S

    .line 29
    .line 30
    int-to-long v10, v2

    .line 31
    new-instance v2, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/16 v5, 0xa

    .line 34
    .line 35
    iget-object v6, v0, Las1;->i0:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v6, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v16

    .line 48
    const/4 v5, 0x0

    .line 49
    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_4

    .line 54
    .line 55
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    add-int/lit8 v17, v5, 0x1

    .line 60
    .line 61
    if-ltz v5, :cond_3

    .line 62
    .line 63
    move-object v8, v6

    .line 64
    check-cast v8, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v6, v0, Las1;->j0:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    rem-int/2addr v5, v7

    .line 73
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lqg5;

    .line 78
    .line 79
    iget-object v6, v5, Lqg5;->X:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v13, v6

    .line 82
    check-cast v13, Ljava/lang/String;

    .line 83
    .line 84
    iget-object v5, v5, Lqg5;->Y:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v9, v5

    .line 87
    check-cast v9, Lbr1;

    .line 88
    .line 89
    iget v5, v0, Las1;->k0:I

    .line 90
    .line 91
    if-nez v5, :cond_2

    .line 92
    .line 93
    const-wide/16 v5, 0x0

    .line 94
    .line 95
    :goto_1
    move-wide v6, v5

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    int-to-long v5, v5

    .line 98
    const-wide/16 v14, 0x1

    .line 99
    .line 100
    add-long/2addr v5, v14

    .line 101
    sget-object v7, Lm66;->Y:Ll2;

    .line 102
    .line 103
    invoke-virtual {v7, v5, v6}, Lm66;->e(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v5

    .line 107
    goto :goto_1

    .line 108
    :goto_2
    sget-object v5, Ltp1;->a:Lnf1;

    .line 109
    .line 110
    sget-object v5, Lye1;->Z:Lye1;

    .line 111
    .line 112
    move-object v12, v5

    .line 113
    new-instance v5, Lzr1;

    .line 114
    .line 115
    const/4 v15, 0x0

    .line 116
    move-object v14, v12

    .line 117
    iget-object v12, v0, Las1;->m0:Lgn2;

    .line 118
    .line 119
    move-object/from16 v18, v14

    .line 120
    .line 121
    iget-object v14, v0, Las1;->n0:Ljava/util/LinkedHashMap;

    .line 122
    .line 123
    move-object/from16 v4, v18

    .line 124
    .line 125
    invoke-direct/range {v5 .. v15}, Lzr1;-><init>(JLjava/lang/String;Lbr1;JLgn2;Ljava/lang/String;Ljava/util/LinkedHashMap;Lq51;)V

    .line 126
    .line 127
    .line 128
    const/4 v6, 0x2

    .line 129
    invoke-static {v1, v4, v5, v6}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move/from16 v5, v17

    .line 137
    .line 138
    const/4 v4, 0x1

    .line 139
    goto :goto_0

    .line 140
    :cond_3
    invoke-static {}, Li21;->X()V

    .line 141
    .line 142
    .line 143
    throw v3

    .line 144
    :cond_4
    iput-object v3, v0, Las1;->h0:Ljava/lang/Object;

    .line 145
    .line 146
    const/4 v1, 0x1

    .line 147
    iput-boolean v1, v0, Las1;->g0:Z

    .line 148
    .line 149
    invoke-static {v2, v0}, Ljb5;->g(Ljava/util/Collection;Ls51;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sget-object v1, Lc71;->X:Lc71;

    .line 154
    .line 155
    if-ne v0, v1, :cond_5

    .line 156
    .line 157
    return-object v1

    .line 158
    :cond_5
    return-object v0
.end method
