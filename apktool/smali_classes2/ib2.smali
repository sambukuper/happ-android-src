.class public final Lib2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;

.field public final c:Lvz7;

.field public final d:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj72;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lvz7;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lib2;->a:Lvz7;

    .line 16
    .line 17
    new-instance v0, Lj72;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lvz7;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lib2;->b:Lvz7;

    .line 29
    .line 30
    new-instance v0, Lj72;

    .line 31
    .line 32
    const/4 v1, 0x5

    .line 33
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lvz7;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lib2;->c:Lvz7;

    .line 42
    .line 43
    new-instance v0, Lj72;

    .line 44
    .line 45
    const/4 v1, 0x6

    .line 46
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lvz7;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lib2;->d:Lvz7;

    .line 55
    .line 56
    return-void
.end method

.method public static b(Lhd6;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhd6;->c()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "providerid"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lsu/happ/proxyutility/dto/ProviderId;->Companion:Lsu/happ/proxyutility/dto/ProviderId$Companion;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public static c(Lhd6;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhd6;->c()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "sub-expire-button-link"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public static d(Lhd6;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhd6;->c()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "sub-info-button-link"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public static e(Lhd6;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lhd6;->c()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "sub-info-button-text"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const-string v0, "base64:"

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {p0, v1, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object v0, Lss8;->a:Lss8;

    .line 35
    .line 36
    const/4 v0, 0x7

    .line 37
    invoke-static {v0, p0}, Lfm7;->f0(ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_0
    const/16 v0, 0x19

    .line 54
    .line 55
    invoke-static {v0, p0}, Lfm7;->Q0(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_1
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method public static f(Lhd6;)Lsu/happ/proxyutility/dto/enums/SubInfoColor;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhd6;->c()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "sub-info-color"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lsu/happ/proxyutility/dto/enums/SubInfoColor;->Companion:Lsu/happ/proxyutility/dto/enums/SubInfoColor$Companion;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Lsu/happ/proxyutility/dto/enums/SubInfoColor$Companion;->a(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/SubInfoColor;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static g(Lhd6;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lhd6;->c()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "sub-info-text"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const-string v0, "base64:"

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {p0, v1, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object v0, Lss8;->a:Lss8;

    .line 35
    .line 36
    const/4 v0, 0x7

    .line 37
    invoke-static {v0, p0}, Lfm7;->f0(ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lss8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_0
    const/16 v0, 0xc8

    .line 54
    .line 55
    invoke-static {v0, p0}, Lfm7;->Q0(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_1
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method

.method public static final i(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Lib2;Ljava/lang/String;Lsu/happ/proxyutility/dto/MetaParams;Ls51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    instance-of v3, v2, Lbb2;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lbb2;

    .line 13
    .line 14
    iget v4, v3, Lbb2;->r0:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lbb2;->r0:I

    .line 24
    .line 25
    :goto_0
    move-object v12, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lbb2;

    .line 28
    .line 29
    invoke-direct {v3, v2}, Ls51;-><init>(Lq51;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v12, Lbb2;->q0:Ljava/lang/Object;

    .line 34
    .line 35
    iget v3, v12, Lbb2;->r0:I

    .line 36
    .line 37
    const/4 v13, 0x5

    .line 38
    const/4 v14, 0x4

    .line 39
    const/4 v4, 0x3

    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v15, 0x1

    .line 43
    const/4 v7, 0x0

    .line 44
    sget-object v8, Lc71;->X:Lc71;

    .line 45
    .line 46
    if-eqz v3, :cond_6

    .line 47
    .line 48
    if-eq v3, v15, :cond_5

    .line 49
    .line 50
    if-eq v3, v5, :cond_4

    .line 51
    .line 52
    if-eq v3, v4, :cond_3

    .line 53
    .line 54
    if-eq v3, v14, :cond_2

    .line 55
    .line 56
    if-ne v3, v13, :cond_1

    .line 57
    .line 58
    iget-object v0, v12, Lbb2;->n0:Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 59
    .line 60
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v3, v7

    .line 64
    goto/16 :goto_14

    .line 65
    .line 66
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v7

    .line 72
    :cond_2
    iget v0, v12, Lbb2;->p0:I

    .line 73
    .line 74
    iget v1, v12, Lbb2;->o0:I

    .line 75
    .line 76
    iget-object v3, v12, Lbb2;->n0:Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 77
    .line 78
    iget-object v4, v12, Lbb2;->m0:Lea6;

    .line 79
    .line 80
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object v2, v3

    .line 84
    move-object v3, v7

    .line 85
    move-object v14, v8

    .line 86
    goto/16 :goto_12

    .line 87
    .line 88
    :cond_3
    iget v0, v12, Lbb2;->p0:I

    .line 89
    .line 90
    iget v1, v12, Lbb2;->o0:I

    .line 91
    .line 92
    iget-object v3, v12, Lbb2;->m0:Lea6;

    .line 93
    .line 94
    iget-object v4, v12, Lbb2;->h0:Lib2;

    .line 95
    .line 96
    iget-object v5, v12, Lbb2;->g0:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    check-cast v2, Lsj6;

    .line 102
    .line 103
    iget-object v2, v2, Lsj6;->X:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v13, v4

    .line 106
    move-object v14, v8

    .line 107
    move-object v4, v3

    .line 108
    move-object v3, v7

    .line 109
    goto/16 :goto_11

    .line 110
    .line 111
    :cond_4
    iget-object v0, v12, Lbb2;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 112
    .line 113
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_d

    .line 117
    .line 118
    :cond_5
    iget v0, v12, Lbb2;->o0:I

    .line 119
    .line 120
    iget-object v1, v12, Lbb2;->m0:Lea6;

    .line 121
    .line 122
    iget-object v3, v12, Lbb2;->l0:Ljava/util/HashMap;

    .line 123
    .line 124
    iget-object v9, v12, Lbb2;->k0:Ljava/lang/Boolean;

    .line 125
    .line 126
    iget-object v10, v12, Lbb2;->j0:Ljava/lang/String;

    .line 127
    .line 128
    iget-object v11, v12, Lbb2;->i0:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v13, v12, Lbb2;->h0:Lib2;

    .line 131
    .line 132
    iget-object v14, v12, Lbb2;->g0:Ljava/lang/String;

    .line 133
    .line 134
    iget-object v4, v12, Lbb2;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 135
    .line 136
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v16, v4

    .line 140
    .line 141
    move v4, v0

    .line 142
    move-object/from16 v0, v16

    .line 143
    .line 144
    goto/16 :goto_b

    .line 145
    .line 146
    :cond_6
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    if-eqz p4, :cond_7

    .line 150
    .line 151
    invoke-virtual/range {p4 .. p4}, Lsu/happ/proxyutility/dto/MetaParams;->F()Ljava/util/Map;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-nez v2, :cond_8

    .line 156
    .line 157
    :cond_7
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->E()Ljava/util/Map;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    :cond_8
    if-eqz p4, :cond_9

    .line 162
    .line 163
    invoke-virtual/range {p4 .. p4}, Lsu/happ/proxyutility/dto/MetaParams;->A0()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    :cond_9
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->T()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    :cond_a
    if-eqz p4, :cond_c

    .line 174
    .line 175
    invoke-virtual/range {p4 .. p4}, Lsu/happ/proxyutility/dto/MetaParams;->P()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    if-nez v4, :cond_b

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_b
    :goto_2
    move-object v10, v4

    .line 183
    goto :goto_4

    .line 184
    :cond_c
    :goto_3
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->H()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    goto :goto_2

    .line 189
    :goto_4
    if-eqz p4, :cond_e

    .line 190
    .line 191
    invoke-virtual/range {p4 .. p4}, Lsu/happ/proxyutility/dto/MetaParams;->U()Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    if-nez v4, :cond_d

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_d
    :goto_5
    move-object v9, v4

    .line 199
    goto :goto_7

    .line 200
    :cond_e
    :goto_6
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->L()Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    goto :goto_5

    .line 205
    :goto_7
    if-eqz v2, :cond_f

    .line 206
    .line 207
    move v4, v15

    .line 208
    goto :goto_8

    .line 209
    :cond_f
    move v4, v6

    .line 210
    :goto_8
    invoke-virtual {v0, v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    if-eqz v3, :cond_10

    .line 215
    .line 216
    new-instance v13, Ljava/net/URL;

    .line 217
    .line 218
    invoke-direct {v13, v11}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v13}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    new-instance v13, Lqg5;

    .line 226
    .line 227
    invoke-direct {v13, v11, v3}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    filled-new-array {v13}, [Lqg5;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-static {v3}, Lzp4;->I([Lqg5;)Ljava/util/HashMap;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    goto :goto_9

    .line 239
    :cond_10
    move-object v3, v7

    .line 240
    :goto_9
    new-instance v11, Lea6;

    .line 241
    .line 242
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 243
    .line 244
    .line 245
    if-nez v4, :cond_11

    .line 246
    .line 247
    move-object v2, v9

    .line 248
    move-object v9, v3

    .line 249
    move-object v3, v2

    .line 250
    move-object/from16 v14, p1

    .line 251
    .line 252
    move-object/from16 v13, p2

    .line 253
    .line 254
    move-object v5, v1

    .line 255
    move v1, v4

    .line 256
    move v2, v6

    .line 257
    move-object v4, v11

    .line 258
    goto :goto_c

    .line 259
    :cond_11
    sget-object v13, Ltp1;->a:Lnf1;

    .line 260
    .line 261
    sget-object v13, Ldm4;->a:Lhv2;

    .line 262
    .line 263
    new-instance v14, Ldb2;

    .line 264
    .line 265
    invoke-direct {v14, v11, v2, v3, v7}, Ldb2;-><init>(Lea6;Ljava/util/Map;Ljava/util/HashMap;Lq51;)V

    .line 266
    .line 267
    .line 268
    iput-object v0, v12, Lbb2;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 269
    .line 270
    move-object/from16 v2, p1

    .line 271
    .line 272
    iput-object v2, v12, Lbb2;->g0:Ljava/lang/String;

    .line 273
    .line 274
    move-object/from16 v5, p2

    .line 275
    .line 276
    iput-object v5, v12, Lbb2;->h0:Lib2;

    .line 277
    .line 278
    iput-object v1, v12, Lbb2;->i0:Ljava/lang/String;

    .line 279
    .line 280
    iput-object v10, v12, Lbb2;->j0:Ljava/lang/String;

    .line 281
    .line 282
    iput-object v9, v12, Lbb2;->k0:Ljava/lang/Boolean;

    .line 283
    .line 284
    iput-object v3, v12, Lbb2;->l0:Ljava/util/HashMap;

    .line 285
    .line 286
    iput-object v11, v12, Lbb2;->m0:Lea6;

    .line 287
    .line 288
    iput v4, v12, Lbb2;->o0:I

    .line 289
    .line 290
    iput v15, v12, Lbb2;->r0:I

    .line 291
    .line 292
    invoke-static {v13, v14, v12}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v13

    .line 296
    if-ne v13, v8, :cond_12

    .line 297
    .line 298
    :goto_a
    move-object v14, v8

    .line 299
    goto/16 :goto_13

    .line 300
    .line 301
    :cond_12
    move-object v14, v11

    .line 302
    move-object v11, v1

    .line 303
    move-object v1, v14

    .line 304
    move-object v14, v2

    .line 305
    move-object v2, v13

    .line 306
    move-object v13, v5

    .line 307
    :goto_b
    check-cast v2, Ljava/lang/Boolean;

    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    move v5, v4

    .line 314
    move-object v4, v1

    .line 315
    move v1, v5

    .line 316
    move-object v5, v9

    .line 317
    move-object v9, v3

    .line 318
    move-object v3, v5

    .line 319
    move-object v5, v11

    .line 320
    :goto_c
    if-eqz v2, :cond_14

    .line 321
    .line 322
    sget-object v3, Ltp1;->a:Lnf1;

    .line 323
    .line 324
    sget-object v3, Ldm4;->a:Lhv2;

    .line 325
    .line 326
    new-instance v5, Lcb2;

    .line 327
    .line 328
    invoke-direct {v5, v4, v7, v6}, Lcb2;-><init>(Lea6;Lq51;B)V

    .line 329
    .line 330
    .line 331
    iput-object v0, v12, Lbb2;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 332
    .line 333
    iput-object v7, v12, Lbb2;->g0:Ljava/lang/String;

    .line 334
    .line 335
    iput-object v7, v12, Lbb2;->h0:Lib2;

    .line 336
    .line 337
    iput-object v7, v12, Lbb2;->i0:Ljava/lang/String;

    .line 338
    .line 339
    iput-object v7, v12, Lbb2;->j0:Ljava/lang/String;

    .line 340
    .line 341
    iput-object v7, v12, Lbb2;->k0:Ljava/lang/Boolean;

    .line 342
    .line 343
    iput-object v7, v12, Lbb2;->l0:Ljava/util/HashMap;

    .line 344
    .line 345
    iput-object v7, v12, Lbb2;->m0:Lea6;

    .line 346
    .line 347
    iput v1, v12, Lbb2;->o0:I

    .line 348
    .line 349
    iput v2, v12, Lbb2;->p0:I

    .line 350
    .line 351
    const/4 v1, 0x2

    .line 352
    iput v1, v12, Lbb2;->r0:I

    .line 353
    .line 354
    invoke-static {v3, v5, v12}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    if-ne v1, v8, :cond_13

    .line 359
    .line 360
    goto :goto_a

    .line 361
    :cond_13
    :goto_d
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 362
    .line 363
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    new-instance v2, Luq0;

    .line 372
    .line 373
    invoke-direct {v2, v0, v15}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1, v2}, Lkf4;->h(Lgn2;)V

    .line 377
    .line 378
    .line 379
    const-string v0, "Failed to start AntiFilter"

    .line 380
    .line 381
    invoke-static {v0}, Lkp5;->t(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    return-object v7

    .line 385
    :cond_14
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 386
    .line 387
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->C0:Lvz7;

    .line 392
    .line 393
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    check-cast v0, La93;

    .line 398
    .line 399
    if-eqz v1, :cond_15

    .line 400
    .line 401
    new-instance v11, Ljava/net/Proxy;

    .line 402
    .line 403
    sget-object v6, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 404
    .line 405
    new-instance v15, Ljava/net/InetSocketAddress;

    .line 406
    .line 407
    const-string v7, "127.0.0.1"

    .line 408
    .line 409
    move-object/from16 p0, v0

    .line 410
    .line 411
    invoke-static {}, Ln67;->d()I

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    invoke-direct {v15, v7, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 416
    .line 417
    .line 418
    invoke-direct {v11, v6, v15}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    .line 419
    .line 420
    .line 421
    goto :goto_e

    .line 422
    :cond_15
    move-object/from16 p0, v0

    .line 423
    .line 424
    const/4 v11, 0x0

    .line 425
    :goto_e
    if-eqz v3, :cond_16

    .line 426
    .line 427
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 428
    .line 429
    .line 430
    move-result v6

    .line 431
    :goto_f
    const/4 v0, 0x0

    .line 432
    goto :goto_10

    .line 433
    :cond_16
    const/4 v6, 0x0

    .line 434
    goto :goto_f

    .line 435
    :goto_10
    iput-object v0, v12, Lbb2;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 436
    .line 437
    iput-object v14, v12, Lbb2;->g0:Ljava/lang/String;

    .line 438
    .line 439
    iput-object v13, v12, Lbb2;->h0:Lib2;

    .line 440
    .line 441
    iput-object v0, v12, Lbb2;->i0:Ljava/lang/String;

    .line 442
    .line 443
    iput-object v0, v12, Lbb2;->j0:Ljava/lang/String;

    .line 444
    .line 445
    iput-object v0, v12, Lbb2;->k0:Ljava/lang/Boolean;

    .line 446
    .line 447
    iput-object v0, v12, Lbb2;->l0:Ljava/util/HashMap;

    .line 448
    .line 449
    iput-object v4, v12, Lbb2;->m0:Lea6;

    .line 450
    .line 451
    iput v1, v12, Lbb2;->o0:I

    .line 452
    .line 453
    iput v2, v12, Lbb2;->p0:I

    .line 454
    .line 455
    const/4 v3, 0x3

    .line 456
    iput v3, v12, Lbb2;->r0:I

    .line 457
    .line 458
    const/4 v7, 0x0

    .line 459
    move-object v3, v11

    .line 460
    move v11, v6

    .line 461
    move-object v6, v14

    .line 462
    move-object v14, v8

    .line 463
    move-object v8, v3

    .line 464
    move-object v3, v0

    .line 465
    move-object v0, v4

    .line 466
    move-object/from16 v4, p0

    .line 467
    .line 468
    invoke-virtual/range {v4 .. v12}, La93;->b(Ljava/lang/String;Ljava/lang/String;ZLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLs51;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    if-ne v4, v14, :cond_17

    .line 473
    .line 474
    goto/16 :goto_13

    .line 475
    .line 476
    :cond_17
    move-object v5, v4

    .line 477
    move-object v4, v0

    .line 478
    move v0, v2

    .line 479
    move-object v2, v5

    .line 480
    move-object v5, v6

    .line 481
    :goto_11
    invoke-static {v2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    check-cast v2, Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 485
    .line 486
    sget-object v6, Lkw4;->a:Lkw4;

    .line 487
    .line 488
    invoke-static {v5}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 489
    .line 490
    .line 491
    move-result-object v6

    .line 492
    if-eqz v6, :cond_18

    .line 493
    .line 494
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 495
    .line 496
    .line 497
    move-result-object v7

    .line 498
    if-eqz v7, :cond_18

    .line 499
    .line 500
    iget-object v8, v13, Lib2;->b:Lvz7;

    .line 501
    .line 502
    invoke-virtual {v8}, Lvz7;->getValue()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v8

    .line 506
    check-cast v8, Lgk7;

    .line 507
    .line 508
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/SubscriptionItem;->b0()Z

    .line 509
    .line 510
    .line 511
    move-result v6

    .line 512
    iput-object v3, v12, Lbb2;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 513
    .line 514
    iput-object v3, v12, Lbb2;->g0:Ljava/lang/String;

    .line 515
    .line 516
    iput-object v3, v12, Lbb2;->h0:Lib2;

    .line 517
    .line 518
    iput-object v3, v12, Lbb2;->i0:Ljava/lang/String;

    .line 519
    .line 520
    iput-object v3, v12, Lbb2;->j0:Ljava/lang/String;

    .line 521
    .line 522
    iput-object v3, v12, Lbb2;->k0:Ljava/lang/Boolean;

    .line 523
    .line 524
    iput-object v3, v12, Lbb2;->l0:Ljava/util/HashMap;

    .line 525
    .line 526
    iput-object v4, v12, Lbb2;->m0:Lea6;

    .line 527
    .line 528
    iput-object v2, v12, Lbb2;->n0:Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 529
    .line 530
    iput v1, v12, Lbb2;->o0:I

    .line 531
    .line 532
    iput v0, v12, Lbb2;->p0:I

    .line 533
    .line 534
    const/4 v9, 0x4

    .line 535
    iput v9, v12, Lbb2;->r0:I

    .line 536
    .line 537
    invoke-virtual {v8, v7, v6, v5, v12}, Lgk7;->a(Lsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/String;Ls51;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v5

    .line 541
    if-ne v5, v14, :cond_18

    .line 542
    .line 543
    goto :goto_13

    .line 544
    :cond_18
    :goto_12
    move/from16 v16, v1

    .line 545
    .line 546
    move v1, v0

    .line 547
    move-object v0, v2

    .line 548
    move/from16 v2, v16

    .line 549
    .line 550
    sget-object v5, Ltp1;->a:Lnf1;

    .line 551
    .line 552
    sget-object v5, Ldm4;->a:Lhv2;

    .line 553
    .line 554
    new-instance v6, Lcb2;

    .line 555
    .line 556
    const/4 v7, 0x1

    .line 557
    invoke-direct {v6, v4, v3, v7}, Lcb2;-><init>(Lea6;Lq51;B)V

    .line 558
    .line 559
    .line 560
    iput-object v3, v12, Lbb2;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 561
    .line 562
    iput-object v3, v12, Lbb2;->g0:Ljava/lang/String;

    .line 563
    .line 564
    iput-object v3, v12, Lbb2;->h0:Lib2;

    .line 565
    .line 566
    iput-object v3, v12, Lbb2;->i0:Ljava/lang/String;

    .line 567
    .line 568
    iput-object v3, v12, Lbb2;->j0:Ljava/lang/String;

    .line 569
    .line 570
    iput-object v3, v12, Lbb2;->k0:Ljava/lang/Boolean;

    .line 571
    .line 572
    iput-object v3, v12, Lbb2;->l0:Ljava/util/HashMap;

    .line 573
    .line 574
    iput-object v3, v12, Lbb2;->m0:Lea6;

    .line 575
    .line 576
    iput-object v0, v12, Lbb2;->n0:Lsu/happ/proxyutility/domain/sub/ImportSubResult;

    .line 577
    .line 578
    iput v2, v12, Lbb2;->o0:I

    .line 579
    .line 580
    iput v1, v12, Lbb2;->p0:I

    .line 581
    .line 582
    const/4 v1, 0x5

    .line 583
    iput v1, v12, Lbb2;->r0:I

    .line 584
    .line 585
    invoke-static {v5, v6, v12}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    if-ne v1, v14, :cond_19

    .line 590
    .line 591
    :goto_13
    return-object v14

    .line 592
    :cond_19
    :goto_14
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->d()Z

    .line 593
    .line 594
    .line 595
    move-result v1

    .line 596
    if-nez v1, :cond_1a

    .line 597
    .line 598
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->c()Lpr;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    iget-object v1, v1, Lpr;->a:Ljava/lang/String;

    .line 603
    .line 604
    const-string v2, "sub_restricted"

    .line 605
    .line 606
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v1

    .line 610
    if-eqz v1, :cond_1a

    .line 611
    .line 612
    goto :goto_15

    .line 613
    :cond_1a
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->b()Lq23;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    if-eqz v1, :cond_1b

    .line 618
    .line 619
    :goto_15
    return-object v3

    .line 620
    :cond_1b
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/ImportSubResult;->c()Lpr;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    iget-object v0, v0, Lpr;->a:Ljava/lang/String;

    .line 625
    .line 626
    return-object v0
.end method

.method public static j(Lhd6;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhd6;->c()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "sub-info-button-link"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p0, :cond_2

    .line 14
    .line 15
    invoke-static {p0}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    const-string v0, "true"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, "1"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 45
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_2
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method public static k(Lsu/happ/proxyutility/dto/SubscriptionItem;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->F()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v2, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;

    .line 14
    .line 15
    invoke-direct {v2, v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;-><init>(Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    :goto_0
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->A0()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->P()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->U()Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    filled-new-array {v2, v1, v3, v4}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x1

    .line 45
    xor-int/2addr v1, v2

    .line 46
    if-ne v1, v2, :cond_1

    .line 47
    .line 48
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 49
    .line 50
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, Lza2;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-direct {v2, v0, p0, v3}, Lza2;-><init>(Lsu/happ/proxyutility/dto/MetaParams;Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Lkf4;->h(Lgn2;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method

.method public static p(Ljava/lang/String;Ldn7;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Lkw4;->a:Lkw4;

    .line 4
    .line 5
    invoke-static/range {p0 .. p0}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Lsu/happ/proxyutility/dto/MetaParams;

    .line 20
    .line 21
    const/4 v4, -0x1

    .line 22
    invoke-direct {v1, v3, v4}, Lsu/happ/proxyutility/dto/MetaParams;-><init>(Ljava/lang/Boolean;I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    move-object v5, v1

    .line 26
    iget-object v1, v0, Ldn7;->a:Lsu/happ/proxyutility/dto/enums/SubInfoColor;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/MetaParams;->O0()Lsu/happ/proxyutility/dto/enums/SubInfoColor;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_2
    move-object v7, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    move-object v7, v3

    .line 43
    :goto_0
    iget-object v1, v0, Ldn7;->b:Ljava/lang/String;

    .line 44
    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_5

    .line 52
    .line 53
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/MetaParams;->P0()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :cond_4
    move-object v8, v1

    .line 58
    goto :goto_1

    .line 59
    :cond_5
    move-object v8, v3

    .line 60
    :goto_1
    iget-object v1, v0, Ldn7;->c:Ljava/lang/String;

    .line 61
    .line 62
    if-nez v1, :cond_6

    .line 63
    .line 64
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-eqz v1, :cond_7

    .line 69
    .line 70
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/MetaParams;->N0()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :cond_6
    move-object v9, v1

    .line 75
    goto :goto_2

    .line 76
    :cond_7
    move-object v9, v3

    .line 77
    :goto_2
    iget-object v1, v0, Ldn7;->d:Ljava/lang/String;

    .line 78
    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_9

    .line 86
    .line 87
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/MetaParams;->M0()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_8
    move-object v10, v1

    .line 92
    goto :goto_3

    .line 93
    :cond_9
    move-object v10, v3

    .line 94
    :goto_3
    iget-object v1, v0, Ldn7;->e:Ljava/lang/Boolean;

    .line 95
    .line 96
    if-nez v1, :cond_a

    .line 97
    .line 98
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-eqz v1, :cond_b

    .line 103
    .line 104
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/MetaParams;->K0()Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    :cond_a
    move-object v11, v1

    .line 109
    goto :goto_4

    .line 110
    :cond_b
    move-object v11, v3

    .line 111
    :goto_4
    iget-object v0, v0, Ldn7;->f:Ljava/lang/String;

    .line 112
    .line 113
    if-nez v0, :cond_d

    .line 114
    .line 115
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_c

    .line 120
    .line 121
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/MetaParams;->L0()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    :cond_c
    move-object v12, v3

    .line 126
    goto :goto_5

    .line 127
    :cond_d
    move-object v12, v0

    .line 128
    :goto_5
    const v14, 0x3fffffff    # 1.9999999f

    .line 129
    .line 130
    .line 131
    const v15, 0xffffff0

    .line 132
    .line 133
    .line 134
    const/4 v6, 0x0

    .line 135
    const/4 v13, -0x1

    .line 136
    invoke-static/range {v5 .. v15}, Lsu/happ/proxyutility/dto/MetaParams;->c(Lsu/happ/proxyutility/dto/MetaParams;Ljava/lang/Boolean;Lsu/happ/proxyutility/dto/enums/SubInfoColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;III)Lsu/happ/proxyutility/dto/MetaParams;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    const/4 v8, 0x0

    .line 141
    const v9, 0xff7ffff

    .line 142
    .line 143
    .line 144
    const-wide/16 v3, 0x0

    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    const/4 v7, 0x0

    .line 148
    invoke-static/range {v2 .. v9}, Lsu/happ/proxyutility/dto/SubscriptionItem;->d(Lsu/happ/proxyutility/dto/SubscriptionItem;JZLsu/happ/proxyutility/dto/MetaParams;ZLjava/lang/Long;I)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    move-object/from16 v1, p0

    .line 153
    .line 154
    invoke-static {v0, v1}, Lkw4;->u(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method


# virtual methods
.method public final a()Lkf4;
    .locals 0

    .line 1
    iget-object p0, p0, Lib2;->d:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkf4;

    .line 8
    .line 9
    return-object p0
.end method

.method public final h(Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Lab2;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lab2;

    .line 9
    .line 10
    iget v2, v1, Lab2;->l0:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lab2;->l0:I

    .line 20
    .line 21
    :goto_0
    move-object v7, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, Lab2;

    .line 24
    .line 25
    invoke-direct {v1, p0, v0}, Lab2;-><init>(Lib2;Ls51;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v0, v7, Lab2;->j0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v1, v7, Lab2;->l0:I

    .line 32
    .line 33
    const/4 v8, 0x5

    .line 34
    const/4 v9, 0x4

    .line 35
    const/4 v10, 0x3

    .line 36
    const/4 v2, 0x1

    .line 37
    const/4 v11, 0x2

    .line 38
    const/4 v12, 0x0

    .line 39
    sget-object v13, Lc71;->X:Lc71;

    .line 40
    .line 41
    if-eqz v1, :cond_6

    .line 42
    .line 43
    if-eq v1, v2, :cond_5

    .line 44
    .line 45
    if-eq v1, v11, :cond_4

    .line 46
    .line 47
    if-eq v1, v10, :cond_3

    .line 48
    .line 49
    if-eq v1, v9, :cond_2

    .line 50
    .line 51
    if-ne v1, v8, :cond_1

    .line 52
    .line 53
    iget-object p0, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 54
    .line 55
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_19

    .line 59
    .line 60
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v12

    .line 66
    :cond_2
    iget-boolean p0, v7, Lab2;->i0:Z

    .line 67
    .line 68
    iget-object v1, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 69
    .line 70
    iget-object v2, v7, Lab2;->f0:Ljava/lang/String;

    .line 71
    .line 72
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    goto/16 :goto_13

    .line 76
    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto/16 :goto_16

    .line 79
    .line 80
    :cond_3
    iget-boolean v1, v7, Lab2;->i0:Z

    .line 81
    .line 82
    iget-object v2, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 83
    .line 84
    iget-object v3, v7, Lab2;->f0:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_11

    .line 90
    .line 91
    :cond_4
    iget-object v1, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 92
    .line 93
    iget-object v2, v7, Lab2;->f0:Ljava/lang/String;

    .line 94
    .line 95
    :try_start_1
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    .line 97
    .line 98
    goto/16 :goto_b

    .line 99
    .line 100
    :catchall_1
    move-exception v0

    .line 101
    goto/16 :goto_e

    .line 102
    .line 103
    :cond_5
    iget-object v1, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 104
    .line 105
    iget-object v2, v7, Lab2;->f0:Ljava/lang/String;

    .line 106
    .line 107
    :try_start_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 108
    .line 109
    .line 110
    goto/16 :goto_5

    .line 111
    .line 112
    :catchall_2
    move-exception v0

    .line 113
    goto/16 :goto_8

    .line 114
    .line 115
    :cond_6
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v0, Lkw4;->a:Lkw4;

    .line 119
    .line 120
    invoke-static {p1}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-nez v1, :cond_7

    .line 125
    .line 126
    goto/16 :goto_1a

    .line 127
    .line 128
    :cond_7
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->u()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_8
    :try_start_3
    sget-object v0, Lss8;->a:Lss8;

    .line 136
    .line 137
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Lss8;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 145
    goto :goto_2

    .line 146
    :catchall_3
    move-exception v0

    .line 147
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 148
    .line 149
    if-nez v3, :cond_1f

    .line 150
    .line 151
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 152
    .line 153
    if-nez v3, :cond_1f

    .line 154
    .line 155
    new-instance v3, Lrj6;

    .line 156
    .line 157
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    move-object v0, v3

    .line 161
    :goto_2
    nop

    .line 162
    instance-of v3, v0, Lrj6;

    .line 163
    .line 164
    if-eqz v3, :cond_9

    .line 165
    .line 166
    move-object v0, v12

    .line 167
    :cond_9
    sget-object v3, Lss8;->a:Lss8;

    .line 168
    .line 169
    move-object v3, v0

    .line 170
    check-cast v3, Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {v3}, Lss8;->z(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_a

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_a
    move-object v0, v12

    .line 180
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 181
    .line 182
    if-nez v0, :cond_b

    .line 183
    .line 184
    goto/16 :goto_1a

    .line 185
    .line 186
    :cond_b
    :goto_4
    :try_start_4
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->X()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    iput-object p1, v7, Lab2;->f0:Ljava/lang/String;

    .line 191
    .line 192
    iput-object v1, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 193
    .line 194
    iput v2, v7, Lab2;->l0:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 195
    .line 196
    const/4 v6, 0x0

    .line 197
    move-object v4, p0

    .line 198
    move-object v3, p1

    .line 199
    move-object v2, v1

    .line 200
    :try_start_5
    invoke-static/range {v2 .. v7}, Lib2;->i(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Lib2;Ljava/lang/String;Lsu/happ/proxyutility/dto/MetaParams;Ls51;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 204
    if-ne v0, v13, :cond_c

    .line 205
    .line 206
    goto/16 :goto_18

    .line 207
    .line 208
    :cond_c
    move-object v1, v2

    .line 209
    move-object v2, p1

    .line 210
    :goto_5
    :try_start_6
    check-cast v0, Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 211
    .line 212
    :goto_6
    move-object v3, v2

    .line 213
    move-object v2, v1

    .line 214
    goto :goto_9

    .line 215
    :catchall_4
    move-exception v0

    .line 216
    move-object v1, v2

    .line 217
    :goto_7
    move-object v2, p1

    .line 218
    goto :goto_8

    .line 219
    :catchall_5
    move-exception v0

    .line 220
    move-object v2, v1

    .line 221
    goto :goto_7

    .line 222
    :goto_8
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 223
    .line 224
    if-nez v3, :cond_1e

    .line 225
    .line 226
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 227
    .line 228
    if-nez v3, :cond_1e

    .line 229
    .line 230
    new-instance v3, Lrj6;

    .line 231
    .line 232
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    move-object v0, v3

    .line 236
    goto :goto_6

    .line 237
    :goto_9
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    if-nez v1, :cond_d

    .line 242
    .line 243
    check-cast v0, Ljava/lang/String;

    .line 244
    .line 245
    new-instance v1, Lsj6;

    .line 246
    .line 247
    invoke-direct {v1, v0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 251
    .line 252
    new-instance v4, Lqg5;

    .line 253
    .line 254
    invoke-direct {v4, v1, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_10

    .line 258
    .line 259
    :cond_d
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->D()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    if-eqz v0, :cond_12

    .line 264
    .line 265
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 266
    .line 267
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v1}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    new-instance v4, Lya2;

    .line 276
    .line 277
    invoke-direct {v4, v9}, Lya2;-><init>(B)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v4}, Lkf4;->h(Lgn2;)V

    .line 281
    .line 282
    .line 283
    :try_start_7
    invoke-static {v0}, Lzl7;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 287
    :try_start_8
    new-instance v1, Ljava/net/URI;

    .line 288
    .line 289
    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-static {v0}, Lzl7;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/MetaParams;

    .line 300
    .line 301
    .line 302
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 303
    goto :goto_a

    .line 304
    :catchall_6
    move-exception v0

    .line 305
    :try_start_9
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 306
    .line 307
    if-nez v1, :cond_10

    .line 308
    .line 309
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 310
    .line 311
    if-nez v1, :cond_10

    .line 312
    .line 313
    new-instance v1, Lrj6;

    .line 314
    .line 315
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 316
    .line 317
    .line 318
    move-object v0, v1

    .line 319
    :goto_a
    :try_start_a
    nop

    .line 320
    instance-of v1, v0, Lrj6;

    .line 321
    .line 322
    if-eqz v1, :cond_e

    .line 323
    .line 324
    move-object v0, v12

    .line 325
    :cond_e
    move-object v6, v0

    .line 326
    check-cast v6, Lsu/happ/proxyutility/dto/MetaParams;

    .line 327
    .line 328
    iput-object v3, v7, Lab2;->f0:Ljava/lang/String;

    .line 329
    .line 330
    iput-object v2, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 331
    .line 332
    iput v11, v7, Lab2;->l0:I

    .line 333
    .line 334
    move-object v4, p0

    .line 335
    invoke-static/range {v2 .. v7}, Lib2;->i(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Lib2;Ljava/lang/String;Lsu/happ/proxyutility/dto/MetaParams;Ls51;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 339
    if-ne v0, v13, :cond_f

    .line 340
    .line 341
    goto/16 :goto_18

    .line 342
    .line 343
    :cond_f
    move-object v1, v2

    .line 344
    move-object v2, v3

    .line 345
    :goto_b
    :try_start_b
    check-cast v0, Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 346
    .line 347
    :goto_c
    move-object v3, v2

    .line 348
    move-object v2, v1

    .line 349
    goto :goto_f

    .line 350
    :catchall_7
    move-exception v0

    .line 351
    move-object v1, v2

    .line 352
    move-object v2, v3

    .line 353
    goto :goto_e

    .line 354
    :catchall_8
    move-exception v0

    .line 355
    goto :goto_d

    .line 356
    :cond_10
    :try_start_c
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 357
    :goto_d
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 358
    :goto_e
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 359
    .line 360
    if-nez v3, :cond_11

    .line 361
    .line 362
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 363
    .line 364
    if-nez v3, :cond_11

    .line 365
    .line 366
    new-instance v3, Lrj6;

    .line 367
    .line 368
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 369
    .line 370
    .line 371
    move-object v0, v3

    .line 372
    goto :goto_c

    .line 373
    :goto_f
    new-instance v1, Lsj6;

    .line 374
    .line 375
    invoke-direct {v1, v0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 379
    .line 380
    new-instance v4, Lqg5;

    .line 381
    .line 382
    invoke-direct {v4, v1, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    goto :goto_10

    .line 386
    :cond_11
    throw v0

    .line 387
    :cond_12
    new-instance v0, Lrj6;

    .line 388
    .line 389
    invoke-direct {v0, v1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    new-instance v1, Lsj6;

    .line 393
    .line 394
    invoke-direct {v1, v0}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 398
    .line 399
    new-instance v4, Lqg5;

    .line 400
    .line 401
    invoke-direct {v4, v1, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    :goto_10
    iget-object v0, v4, Lqg5;->X:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v0, Lsj6;

    .line 407
    .line 408
    iget-object v0, v0, Lsj6;->X:Ljava/lang/Object;

    .line 409
    .line 410
    iget-object v1, v4, Lqg5;->Y:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v1, Ljava/lang/Boolean;

    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    instance-of v4, v0, Lrj6;

    .line 419
    .line 420
    if-eqz v4, :cond_13

    .line 421
    .line 422
    move-object v0, v12

    .line 423
    :cond_13
    check-cast v0, Ljava/lang/String;

    .line 424
    .line 425
    if-nez v0, :cond_14

    .line 426
    .line 427
    goto/16 :goto_1a

    .line 428
    .line 429
    :cond_14
    sget-object v4, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 430
    .line 431
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    iget-object v4, v4, Lsu/happ/proxyutility/HappApplication;->H0:Lvz7;

    .line 436
    .line 437
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    check-cast v4, Li83;

    .line 442
    .line 443
    iput-object v3, v7, Lab2;->f0:Ljava/lang/String;

    .line 444
    .line 445
    iput-object v2, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 446
    .line 447
    iput-boolean v1, v7, Lab2;->i0:Z

    .line 448
    .line 449
    iput v10, v7, Lab2;->l0:I

    .line 450
    .line 451
    iget-object v4, v4, Li83;->a:Lvz7;

    .line 452
    .line 453
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    check-cast v4, Lf83;

    .line 458
    .line 459
    invoke-virtual {v4, v0, v3, v7}, Lf83;->a(Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    if-ne v0, v13, :cond_15

    .line 464
    .line 465
    goto/16 :goto_18

    .line 466
    .line 467
    :cond_15
    :goto_11
    check-cast v0, Lsu/happ/proxyutility/dto/ImportResult;

    .line 468
    .line 469
    invoke-static {v2}, Lib2;->k(Lsu/happ/proxyutility/dto/SubscriptionItem;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ImportResult;->a()I

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-gtz v0, :cond_1d

    .line 477
    .line 478
    if-eqz v1, :cond_16

    .line 479
    .line 480
    goto/16 :goto_1a

    .line 481
    .line 482
    :cond_16
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionItem;->D()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    if-eqz v5, :cond_1d

    .line 487
    .line 488
    :try_start_e
    sget-object v0, Lzl7;->a:Lkc6;

    .line 489
    .line 490
    new-instance v0, Ljava/net/URI;

    .line 491
    .line 492
    invoke-direct {v0, v5}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    invoke-static {v0}, Lzl7;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/MetaParams;

    .line 503
    .line 504
    .line 505
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 506
    goto :goto_12

    .line 507
    :catchall_9
    move-exception v0

    .line 508
    :try_start_f
    instance-of v4, v0, Ljava/lang/InterruptedException;

    .line 509
    .line 510
    if-nez v4, :cond_19

    .line 511
    .line 512
    instance-of v4, v0, Ljava/util/concurrent/CancellationException;

    .line 513
    .line 514
    if-nez v4, :cond_19

    .line 515
    .line 516
    new-instance v4, Lrj6;

    .line 517
    .line 518
    invoke-direct {v4, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 519
    .line 520
    .line 521
    move-object v0, v4

    .line 522
    :goto_12
    :try_start_10
    nop

    .line 523
    instance-of v4, v0, Lrj6;

    .line 524
    .line 525
    if-eqz v4, :cond_17

    .line 526
    .line 527
    move-object v0, v12

    .line 528
    :cond_17
    move-object v6, v0

    .line 529
    check-cast v6, Lsu/happ/proxyutility/dto/MetaParams;

    .line 530
    .line 531
    iput-object v3, v7, Lab2;->f0:Ljava/lang/String;

    .line 532
    .line 533
    iput-object v2, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 534
    .line 535
    iput-boolean v1, v7, Lab2;->i0:Z

    .line 536
    .line 537
    iput v9, v7, Lab2;->l0:I

    .line 538
    .line 539
    move-object v4, p0

    .line 540
    invoke-static/range {v2 .. v7}, Lib2;->i(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Lib2;Ljava/lang/String;Lsu/happ/proxyutility/dto/MetaParams;Ls51;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 544
    if-ne v0, v13, :cond_18

    .line 545
    .line 546
    goto :goto_18

    .line 547
    :cond_18
    move p0, v1

    .line 548
    move-object v1, v2

    .line 549
    move-object v2, v3

    .line 550
    :goto_13
    :try_start_11
    check-cast v0, Ljava/lang/String;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 551
    .line 552
    move-object v3, v0

    .line 553
    :goto_14
    move v0, p0

    .line 554
    move-object p0, v1

    .line 555
    goto :goto_17

    .line 556
    :catchall_a
    move-exception v0

    .line 557
    move p0, v1

    .line 558
    move-object v1, v2

    .line 559
    move-object v2, v3

    .line 560
    goto :goto_16

    .line 561
    :catchall_b
    move-exception v0

    .line 562
    move-object p0, v0

    .line 563
    goto :goto_15

    .line 564
    :cond_19
    :try_start_12
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    .line 565
    :goto_15
    :try_start_13
    throw p0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 566
    :goto_16
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 567
    .line 568
    if-nez v3, :cond_1c

    .line 569
    .line 570
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 571
    .line 572
    if-nez v3, :cond_1c

    .line 573
    .line 574
    new-instance v3, Lrj6;

    .line 575
    .line 576
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 577
    .line 578
    .line 579
    goto :goto_14

    .line 580
    :goto_17
    instance-of v1, v3, Lrj6;

    .line 581
    .line 582
    if-nez v1, :cond_1d

    .line 583
    .line 584
    move-object v1, v3

    .line 585
    check-cast v1, Ljava/lang/String;

    .line 586
    .line 587
    if-nez v1, :cond_1a

    .line 588
    .line 589
    goto :goto_1a

    .line 590
    :cond_1a
    sget-object v4, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 591
    .line 592
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    iget-object v4, v4, Lsu/happ/proxyutility/HappApplication;->H0:Lvz7;

    .line 597
    .line 598
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v4

    .line 602
    check-cast v4, Li83;

    .line 603
    .line 604
    iput-object v12, v7, Lab2;->f0:Ljava/lang/String;

    .line 605
    .line 606
    iput-object p0, v7, Lab2;->g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 607
    .line 608
    iput-object v3, v7, Lab2;->h0:Ljava/io/Serializable;

    .line 609
    .line 610
    iput-boolean v0, v7, Lab2;->i0:Z

    .line 611
    .line 612
    iput v8, v7, Lab2;->l0:I

    .line 613
    .line 614
    iget-object v0, v4, Li83;->a:Lvz7;

    .line 615
    .line 616
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    check-cast v0, Lf83;

    .line 621
    .line 622
    invoke-virtual {v0, v1, v2, v7}, Lf83;->a(Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    if-ne v0, v13, :cond_1b

    .line 627
    .line 628
    :goto_18
    return-object v13

    .line 629
    :cond_1b
    :goto_19
    invoke-static {p0}, Lib2;->k(Lsu/happ/proxyutility/dto/SubscriptionItem;)V

    .line 630
    .line 631
    .line 632
    goto :goto_1a

    .line 633
    :cond_1c
    throw v0

    .line 634
    :cond_1d
    :goto_1a
    sget-object p0, Ldn8;->a:Ldn8;

    .line 635
    .line 636
    return-object p0

    .line 637
    :cond_1e
    throw v0

    .line 638
    :cond_1f
    throw v0
.end method

.method public final l(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Leb2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Leb2;

    .line 7
    .line 8
    iget v1, v0, Leb2;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Leb2;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Leb2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Leb2;-><init>(Lib2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Leb2;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Leb2;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 49
    .line 50
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lsu/happ/proxyutility/HappApplication;->c()Lqc2;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput v2, v0, Leb2;->h0:I

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lqc2;->b(Ls51;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object v0, Lc71;->X:Lc71;

    .line 65
    .line 66
    if-ne p1, v0, :cond_3

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-virtual {p0}, Lib2;->a()Lkf4;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance v0, Lqb;

    .line 80
    .line 81
    const/4 v1, 0x3

    .line 82
    invoke-direct {v0, v1, p1}, Lqb;-><init>(BI)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0}, Lkf4;->g(Lgn2;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Ldn8;->a:Ldn8;

    .line 89
    .line 90
    return-object p0
.end method

.method public final m(Landroid/content/Context;Lhd6;Ls51;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lfb2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lfb2;

    .line 7
    .line 8
    iget v1, v0, Lfb2;->k0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lfb2;->k0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfb2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lfb2;-><init>(Lib2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lfb2;->i0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lfb2;->k0:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lfb2;->h0:Ljava/util/Iterator;

    .line 41
    .line 42
    iget-object p2, v0, Lfb2;->f0:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    iget-object p1, v0, Lfb2;->h0:Ljava/util/Iterator;

    .line 56
    .line 57
    iget-object p2, v0, Lfb2;->g0:Ljava/util/List;

    .line 58
    .line 59
    iget-object v1, v0, Lfb2;->f0:Landroid/content/Context;

    .line 60
    .line 61
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object p3, p2

    .line 65
    move-object p2, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object p3, Lkw4;->a:Lkw4;

    .line 71
    .line 72
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-virtual {p2}, Lhd6;->c()Ljava/util/HashMap;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    const-string v1, "input-data"

    .line 81
    .line 82
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, Ljava/lang/String;

    .line 87
    .line 88
    if-eqz p2, :cond_6

    .line 89
    .line 90
    invoke-static {p2}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-eqz p2, :cond_6

    .line 99
    .line 100
    sget-object v1, Lss8;->a:Lss8;

    .line 101
    .line 102
    invoke-static {p2}, Lss8;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    if-eqz p2, :cond_6

    .line 107
    .line 108
    invoke-virtual {p0}, Lib2;->a()Lkf4;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    new-instance v6, Lm40;

    .line 113
    .line 114
    const/4 v7, 0x7

    .line 115
    invoke-direct {v6, p2, v7}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v6}, Lkf4;->g(Lgn2;)V

    .line 119
    .line 120
    .line 121
    new-instance v1, Lla4;

    .line 122
    .line 123
    invoke-direct {v1, p2}, Lla4;-><init>(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    move-object p2, p1

    .line 127
    move-object p1, v1

    .line 128
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Ljava/lang/String;

    .line 139
    .line 140
    sget-object v6, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 141
    .line 142
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    iget-object v6, v6, Lsu/happ/proxyutility/HappApplication;->H0:Lvz7;

    .line 147
    .line 148
    invoke-virtual {v6}, Lvz7;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    check-cast v6, Li83;

    .line 153
    .line 154
    iput-object p2, v0, Lfb2;->f0:Landroid/content/Context;

    .line 155
    .line 156
    iput-object p3, v0, Lfb2;->g0:Ljava/util/List;

    .line 157
    .line 158
    iput-object p1, v0, Lfb2;->h0:Ljava/util/Iterator;

    .line 159
    .line 160
    iput v3, v0, Lfb2;->k0:I

    .line 161
    .line 162
    sget-object v7, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 163
    .line 164
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    iget-object v6, v6, Li83;->a:Lvz7;

    .line 172
    .line 173
    invoke-virtual {v6}, Lvz7;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    check-cast v6, Lf83;

    .line 178
    .line 179
    invoke-virtual {v6, v1, v7, v0}, Lf83;->a(Ljava/lang/String;Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    if-ne v1, v5, :cond_4

    .line 184
    .line 185
    goto/16 :goto_5

    .line 186
    .line 187
    :cond_5
    move-object p1, p2

    .line 188
    :cond_6
    sget-object p2, Lkw4;->a:Lkw4;

    .line 189
    .line 190
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    new-instance v1, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_a

    .line 208
    .line 209
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    move-object v6, v3

    .line 214
    check-cast v6, Lqg5;

    .line 215
    .line 216
    if-eqz p3, :cond_7

    .line 217
    .line 218
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-eqz v7, :cond_7

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_7
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    if-eqz v8, :cond_9

    .line 234
    .line 235
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    check-cast v8, Lqg5;

    .line 240
    .line 241
    iget-object v9, v6, Lqg5;->X:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v9, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 244
    .line 245
    invoke-virtual {v9}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    iget-object v8, v8, Lqg5;->X:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v8, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 252
    .line 253
    invoke-virtual {v8}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    invoke-static {v9, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-eqz v8, :cond_8

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_9
    :goto_3
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    move-object v10, p2

    .line 273
    move-object p2, p1

    .line 274
    move-object p1, v10

    .line 275
    :cond_b
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result p3

    .line 279
    if-eqz p3, :cond_c

    .line 280
    .line 281
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p3

    .line 285
    check-cast p3, Lqg5;

    .line 286
    .line 287
    iget-object v1, p3, Lqg5;->X:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 290
    .line 291
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    iget-object p3, p3, Lqg5;->Y:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast p3, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 298
    .line 299
    sget-object v3, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 300
    .line 301
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-virtual {v3}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    new-instance v6, Luq0;

    .line 310
    .line 311
    invoke-direct {v6, p3, v2}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v6}, Lkf4;->h(Lgn2;)V

    .line 315
    .line 316
    .line 317
    iput-object p2, v0, Lfb2;->f0:Landroid/content/Context;

    .line 318
    .line 319
    iput-object v4, v0, Lfb2;->g0:Ljava/util/List;

    .line 320
    .line 321
    iput-object p1, v0, Lfb2;->h0:Ljava/util/Iterator;

    .line 322
    .line 323
    iput v2, v0, Lfb2;->k0:I

    .line 324
    .line 325
    invoke-virtual {p0, v1, v0}, Lib2;->h(Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object p3

    .line 329
    if-ne p3, v5, :cond_b

    .line 330
    .line 331
    :goto_5
    return-object v5

    .line 332
    :cond_c
    const/16 p0, 0x7e

    .line 333
    .line 334
    invoke-static {p2, p0}, Lqe4;->O0(Landroid/content/Context;I)V

    .line 335
    .line 336
    .line 337
    sget-object p0, Ldn8;->a:Ldn8;

    .line 338
    .line 339
    return-object p0
.end method

.method public final n(Landroid/content/Context;Lhd6;Ls51;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lgb2;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lgb2;

    .line 11
    .line 12
    iget v3, v2, Lgb2;->l0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lgb2;->l0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lgb2;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lgb2;-><init>(Lib2;Ls51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lgb2;->j0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lgb2;->l0:I

    .line 32
    .line 33
    sget-object v4, Ldn8;->a:Ldn8;

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    iget-boolean v3, v2, Lgb2;->i0:Z

    .line 42
    .line 43
    iget-object v6, v2, Lgb2;->h0:Ljava/util/Iterator;

    .line 44
    .line 45
    iget-object v7, v2, Lgb2;->g0:Ldn7;

    .line 46
    .line 47
    iget-object v8, v2, Lgb2;->f0:Landroid/content/Context;

    .line 48
    .line 49
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v15, v2

    .line 53
    move-object v2, v6

    .line 54
    move-object v6, v7

    .line 55
    move-object v1, v8

    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v6

    .line 64
    :cond_2
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static/range {p2 .. p2}, Lib2;->b(Lhd6;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    return-object v4

    .line 74
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lhd6;->c()Ljava/util/HashMap;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const-string v7, "sign-control"

    .line 79
    .line 80
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    invoke-static {v3}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    :cond_4
    const-string v3, "JT9ZDH1N7wc66LIKi0ix300H2PK4J83H"

    .line 97
    .line 98
    invoke-static {v6, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-static/range {p2 .. p2}, Lib2;->f(Lhd6;)Lsu/happ/proxyutility/dto/enums/SubInfoColor;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-static/range {p2 .. p2}, Lib2;->g(Lhd6;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-static/range {p2 .. p2}, Lib2;->e(Lhd6;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    invoke-static/range {p2 .. p2}, Lib2;->d(Lhd6;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-static/range {p2 .. p2}, Lib2;->c(Lhd6;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    invoke-static/range {p2 .. p2}, Lib2;->j(Lhd6;)Ljava/lang/Boolean;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    new-instance v6, Ldn7;

    .line 127
    .line 128
    invoke-direct/range {v6 .. v12}, Ldn7;-><init>(Lsu/happ/proxyutility/dto/enums/SubInfoColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lib2;->a()Lkf4;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    new-instance v8, Ly0;

    .line 136
    .line 137
    move-object/from16 v9, p2

    .line 138
    .line 139
    invoke-direct {v8, v0, v9}, Ly0;-><init>(Lib2;Lhd6;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, v8}, Lkf4;->g(Lgn2;)V

    .line 143
    .line 144
    .line 145
    if-eqz v3, :cond_5

    .line 146
    .line 147
    new-instance v7, Ldx0;

    .line 148
    .line 149
    const/16 v8, 0x1b

    .line 150
    .line 151
    invoke-direct {v7, v8}, Ldx0;-><init>(B)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    new-instance v7, Ldx0;

    .line 156
    .line 157
    const/16 v8, 0x1c

    .line 158
    .line 159
    invoke-direct {v7, v8}, Ldx0;-><init>(B)V

    .line 160
    .line 161
    .line 162
    :goto_1
    sget-object v8, Lkw4;->a:Lkw4;

    .line 163
    .line 164
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    new-instance v9, Lhu;

    .line 169
    .line 170
    invoke-direct {v9, v8, v5}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 171
    .line 172
    .line 173
    new-instance v8, Lp0;

    .line 174
    .line 175
    const/16 v10, 0x16

    .line 176
    .line 177
    invoke-direct {v8, v7, v1, v10}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 178
    .line 179
    .line 180
    new-instance v1, Lla2;

    .line 181
    .line 182
    invoke-direct {v1, v9, v5, v8}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 183
    .line 184
    .line 185
    new-instance v7, Lka2;

    .line 186
    .line 187
    invoke-direct {v7, v1}, Lka2;-><init>(Lla2;)V

    .line 188
    .line 189
    .line 190
    move-object/from16 v1, p1

    .line 191
    .line 192
    move-object v15, v2

    .line 193
    move-object v2, v7

    .line 194
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_7

    .line 199
    .line 200
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    check-cast v7, Lqg5;

    .line 205
    .line 206
    iget-object v7, v7, Lqg5;->X:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v7, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 209
    .line 210
    invoke-virtual {v7}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-static {v7, v6}, Lib2;->p(Ljava/lang/String;Ldn7;)V

    .line 215
    .line 216
    .line 217
    iget-object v8, v0, Lib2;->a:Lvz7;

    .line 218
    .line 219
    invoke-virtual {v8}, Lvz7;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    check-cast v8, Lpr7;

    .line 224
    .line 225
    iput-object v1, v15, Lgb2;->f0:Landroid/content/Context;

    .line 226
    .line 227
    iput-object v6, v15, Lgb2;->g0:Ldn7;

    .line 228
    .line 229
    iput-object v2, v15, Lgb2;->h0:Ljava/util/Iterator;

    .line 230
    .line 231
    iput-boolean v3, v15, Lgb2;->i0:Z

    .line 232
    .line 233
    iput v5, v15, Lgb2;->l0:I

    .line 234
    .line 235
    move-object v9, v6

    .line 236
    move-object v6, v8

    .line 237
    const/4 v8, 0x0

    .line 238
    move-object v10, v9

    .line 239
    const/4 v9, 0x0

    .line 240
    move-object v11, v10

    .line 241
    const/4 v10, 0x0

    .line 242
    move-object v12, v11

    .line 243
    const/4 v11, 0x0

    .line 244
    move-object v13, v12

    .line 245
    const/4 v12, 0x0

    .line 246
    move-object v14, v13

    .line 247
    const/4 v13, 0x0

    .line 248
    move-object/from16 v16, v14

    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    move-object/from16 v17, v16

    .line 252
    .line 253
    const/16 v16, 0x17e

    .line 254
    .line 255
    invoke-static/range {v6 .. v16}, Lpr7;->b(Lpr7;Ljava/lang/String;ZLjava/lang/String;Lq30;Lok4;Lzs1;Lpk4;Ljava/lang/Boolean;Ls51;I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    sget-object v7, Lc71;->X:Lc71;

    .line 260
    .line 261
    if-ne v6, v7, :cond_6

    .line 262
    .line 263
    return-object v7

    .line 264
    :cond_6
    move-object/from16 v6, v17

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_7
    const/16 v0, 0x81

    .line 268
    .line 269
    invoke-static {v1, v0}, Lqe4;->O0(Landroid/content/Context;I)V

    .line 270
    .line 271
    .line 272
    return-object v4
.end method

.method public final o(Landroid/content/Context;Lhd6;Ls51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lhb2;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lhb2;

    .line 11
    .line 12
    iget v3, v2, Lhb2;->k0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lhb2;->k0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lhb2;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lhb2;-><init>(Lib2;Ls51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lhb2;->i0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lhb2;->k0:I

    .line 32
    .line 33
    sget-object v4, Ldn8;->a:Ldn8;

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    iget-object v3, v2, Lhb2;->h0:Ljava/util/Iterator;

    .line 42
    .line 43
    iget-object v6, v2, Lhb2;->g0:Ldn7;

    .line 44
    .line 45
    iget-object v7, v2, Lhb2;->f0:Landroid/content/Context;

    .line 46
    .line 47
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v15, v2

    .line 51
    move-object v2, v6

    .line 52
    move-object v1, v7

    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v6

    .line 61
    :cond_2
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static/range {p2 .. p2}, Lib2;->b(Lhd6;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-nez v1, :cond_3

    .line 69
    .line 70
    return-object v4

    .line 71
    :cond_3
    invoke-static/range {p2 .. p2}, Lib2;->f(Lhd6;)Lsu/happ/proxyutility/dto/enums/SubInfoColor;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-static/range {p2 .. p2}, Lib2;->g(Lhd6;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-static/range {p2 .. p2}, Lib2;->e(Lhd6;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    invoke-static/range {p2 .. p2}, Lib2;->d(Lhd6;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    invoke-static/range {p2 .. p2}, Lib2;->c(Lhd6;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    invoke-static/range {p2 .. p2}, Lib2;->j(Lhd6;)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    new-instance v7, Ldn7;

    .line 96
    .line 97
    invoke-direct/range {v7 .. v13}, Ldn7;-><init>(Lsu/happ/proxyutility/dto/enums/SubInfoColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sget-object v3, Lkw4;->a:Lkw4;

    .line 101
    .line 102
    invoke-static {}, Lkw4;->d()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    new-instance v8, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_6

    .line 120
    .line 121
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    move-object v10, v9

    .line 126
    check-cast v10, Lqg5;

    .line 127
    .line 128
    iget-object v10, v10, Lqg5;->Y:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v10, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 131
    .line 132
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    if-nez v10, :cond_5

    .line 137
    .line 138
    move-object v10, v6

    .line 139
    :cond_5
    invoke-static {v10, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    if-eqz v10, :cond_4

    .line 144
    .line 145
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_6
    invoke-virtual {v0}, Lib2;->a()Lkf4;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    new-instance v3, Lkd;

    .line 154
    .line 155
    const/4 v6, 0x2

    .line 156
    invoke-direct {v3, v8, v6}, Lkd;-><init>(Ljava/util/ArrayList;B)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v3}, Lkf4;->g(Lgn2;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    move-object v3, v1

    .line 167
    move-object v15, v2

    .line 168
    move-object v2, v7

    .line 169
    move-object/from16 v1, p1

    .line 170
    .line 171
    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_8

    .line 176
    .line 177
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    check-cast v6, Lqg5;

    .line 182
    .line 183
    iget-object v6, v6, Lqg5;->X:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v6, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 186
    .line 187
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-static {v7, v2}, Lib2;->p(Ljava/lang/String;Ldn7;)V

    .line 192
    .line 193
    .line 194
    iget-object v6, v0, Lib2;->a:Lvz7;

    .line 195
    .line 196
    invoke-virtual {v6}, Lvz7;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    check-cast v6, Lpr7;

    .line 201
    .line 202
    iput-object v1, v15, Lhb2;->f0:Landroid/content/Context;

    .line 203
    .line 204
    iput-object v2, v15, Lhb2;->g0:Ldn7;

    .line 205
    .line 206
    iput-object v3, v15, Lhb2;->h0:Ljava/util/Iterator;

    .line 207
    .line 208
    iput v5, v15, Lhb2;->k0:I

    .line 209
    .line 210
    const/4 v8, 0x0

    .line 211
    const/4 v9, 0x0

    .line 212
    const/4 v10, 0x0

    .line 213
    const/4 v11, 0x0

    .line 214
    const/4 v12, 0x0

    .line 215
    const/4 v13, 0x0

    .line 216
    const/4 v14, 0x0

    .line 217
    const/16 v16, 0x17e

    .line 218
    .line 219
    invoke-static/range {v6 .. v16}, Lpr7;->b(Lpr7;Ljava/lang/String;ZLjava/lang/String;Lq30;Lok4;Lzs1;Lpk4;Ljava/lang/Boolean;Ls51;I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    sget-object v7, Lc71;->X:Lc71;

    .line 224
    .line 225
    if-ne v6, v7, :cond_7

    .line 226
    .line 227
    return-object v7

    .line 228
    :cond_8
    const/16 v0, 0x81

    .line 229
    .line 230
    invoke-static {v1, v0}, Lqe4;->O0(Landroid/content/Context;I)V

    .line 231
    .line 232
    .line 233
    return-object v4
.end method
