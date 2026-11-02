.class public final Lyh4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltn2;


# instance fields
.field public final synthetic X:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyh4;->X:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lk44;

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    move-object/from16 v11, p3

    .line 14
    .line 15
    check-cast v11, Llp2;

    .line 16
    .line 17
    move-object/from16 v2, p4

    .line 18
    .line 19
    check-cast v2, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    and-int/lit8 v3, v2, 0x6

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v11, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x2

    .line 38
    :goto_0
    or-int/2addr v0, v2

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v0, v2

    .line 41
    :goto_1
    and-int/lit8 v2, v2, 0x30

    .line 42
    .line 43
    if-nez v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v11, v1}, Llp2;->d(I)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    const/16 v2, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v2, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v0, v2

    .line 57
    :cond_3
    and-int/lit16 v2, v0, 0x93

    .line 58
    .line 59
    const/16 v3, 0x92

    .line 60
    .line 61
    const/4 v14, 0x0

    .line 62
    const/4 v4, 0x1

    .line 63
    if-eq v2, v3, :cond_4

    .line 64
    .line 65
    move v2, v4

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    move v2, v14

    .line 68
    :goto_3
    and-int/2addr v0, v4

    .line 69
    invoke-virtual {v11, v0, v2}, Llp2;->N(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    move-object/from16 v0, p0

    .line 76
    .line 77
    iget-object v0, v0, Lyh4;->X:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object v2, v0

    .line 84
    check-cast v2, Ljava/lang/String;

    .line 85
    .line 86
    const v0, 0x11545977

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v0}, Llp2;->W(I)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Les;->a:Lox1;

    .line 93
    .line 94
    invoke-virtual {v11, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lds;

    .line 99
    .line 100
    iget-object v15, v0, Lds;->c:Lo88;

    .line 101
    .line 102
    sget-object v0, Lep;->z:Lox1;

    .line 103
    .line 104
    invoke-virtual {v11, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ldp;

    .line 109
    .line 110
    iget-object v0, v0, Ldp;->c:Lxr;

    .line 111
    .line 112
    iget-wide v0, v0, Lxr;->a:J

    .line 113
    .line 114
    const/16 v3, 0x14

    .line 115
    .line 116
    invoke-static {v3}, Leu7;->g(I)J

    .line 117
    .line 118
    .line 119
    move-result-wide v24

    .line 120
    const/16 v26, 0x0

    .line 121
    .line 122
    const v27, 0xfdfffe

    .line 123
    .line 124
    .line 125
    const-wide/16 v18, 0x0

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    const-wide/16 v22, 0x0

    .line 132
    .line 133
    move-wide/from16 v16, v0

    .line 134
    .line 135
    invoke-static/range {v15 .. v27}, Lo88;->a(Lo88;JJLdj2;Lgi2;JJLaa4;I)Lo88;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 140
    .line 141
    const v12, 0xc00030

    .line 142
    .line 143
    .line 144
    const/16 v13, 0x178

    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    const/4 v6, 0x0

    .line 148
    const/4 v7, 0x0

    .line 149
    const/4 v8, 0x0

    .line 150
    const/4 v9, 0x0

    .line 151
    const/4 v10, 0x0

    .line 152
    invoke-static/range {v2 .. v13}, Lzc1;->g(Ljava/lang/String;Lkx4;Lo88;IIIIZLgn2;Llp2;II)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v11, v14}, Llp2;->p(Z)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_5
    invoke-virtual {v11}, Llp2;->Q()V

    .line 160
    .line 161
    .line 162
    :goto_4
    sget-object v0, Ldn8;->a:Ldn8;

    .line 163
    .line 164
    return-object v0
.end method
