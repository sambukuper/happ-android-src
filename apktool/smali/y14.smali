.class public final Ly14;
.super Lw79;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final i:Ly14;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly14;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly14;->i:Ly14;

    .line 7
    .line 8
    return-void
.end method

.method public static S(Laa7;)Laa7;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lt14;->n0()Llh8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lco0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/16 v3, 0xa

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    check-cast v0, Lco0;

    .line 14
    .line 15
    iget-object v1, v0, Lco0;->X:Lni8;

    .line 16
    .line 17
    invoke-virtual {v1}, Lni8;->a()Lrt8;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    sget-object v6, Lrt8;->f0:Lrt8;

    .line 22
    .line 23
    if-ne v5, v6, :cond_0

    .line 24
    .line 25
    move-object v5, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v5, v4

    .line 28
    :goto_0
    if-eqz v5, :cond_1

    .line 29
    .line 30
    invoke-virtual {v5}, Lni8;->b()Lt14;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {v5}, Lt14;->q0()Lmo8;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    move-object v9, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v9, v4

    .line 43
    :goto_1
    iget-object v5, v0, Lco0;->Y:Ld45;

    .line 44
    .line 45
    if-nez v5, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, Lco0;->c()Ljava/util/Collection;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/lang/Iterable;

    .line 52
    .line 53
    new-instance v6, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-static {v5, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lt14;

    .line 77
    .line 78
    invoke-virtual {v5}, Lt14;->q0()Lmo8;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    new-instance v5, Ld45;

    .line 87
    .line 88
    new-instance v3, Lpl1;

    .line 89
    .line 90
    invoke-direct {v3, v6, v2}, Lpl1;-><init>(Ljava/util/ArrayList;B)V

    .line 91
    .line 92
    .line 93
    const/16 v2, 0x8

    .line 94
    .line 95
    invoke-direct {v5, v1, v3, v4, v2}, Ld45;-><init>(Lni8;Lpl1;Lhi8;I)V

    .line 96
    .line 97
    .line 98
    iput-object v5, v0, Lco0;->Y:Ld45;

    .line 99
    .line 100
    :cond_3
    move-object v8, v5

    .line 101
    new-instance v6, Lc45;

    .line 102
    .line 103
    invoke-virtual {p0}, Lt14;->m0()Lch8;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    invoke-virtual {p0}, Lt14;->o0()Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    const/16 v12, 0x20

    .line 112
    .line 113
    sget-object v7, Lun0;->X:Lun0;

    .line 114
    .line 115
    invoke-direct/range {v6 .. v12}, Lc45;-><init>(Lun0;Ld45;Lmo8;Lch8;ZI)V

    .line 116
    .line 117
    .line 118
    return-object v6

    .line 119
    :cond_4
    instance-of v1, v0, Lqg3;

    .line 120
    .line 121
    if-eqz v1, :cond_9

    .line 122
    .line 123
    invoke-virtual {p0}, Lt14;->o0()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_9

    .line 128
    .line 129
    check-cast v0, Lqg3;

    .line 130
    .line 131
    iget-object p0, v0, Lqg3;->Y:Ljava/util/LinkedHashSet;

    .line 132
    .line 133
    new-instance v1, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-static {p0, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const/4 v3, 0x0

    .line 147
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_5

    .line 152
    .line 153
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Lt14;

    .line 158
    .line 159
    invoke-static {v3}, Ly08;->j(Lt14;)Lmo8;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move v3, v2

    .line 167
    goto :goto_3

    .line 168
    :cond_5
    if-nez v3, :cond_6

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_6
    iget-object p0, v0, Lqg3;->X:Lt14;

    .line 172
    .line 173
    if-eqz p0, :cond_7

    .line 174
    .line 175
    invoke-static {p0}, Ly08;->j(Lt14;)Lmo8;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 183
    .line 184
    invoke-direct {p0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 188
    .line 189
    .line 190
    new-instance v1, Lqg3;

    .line 191
    .line 192
    invoke-direct {v1, p0}, Lqg3;-><init>(Ljava/util/AbstractCollection;)V

    .line 193
    .line 194
    .line 195
    iput-object v4, v1, Lqg3;->X:Lt14;

    .line 196
    .line 197
    move-object v4, v1

    .line 198
    :goto_4
    if-nez v4, :cond_8

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_8
    move-object v0, v4

    .line 202
    :goto_5
    invoke-virtual {v0}, Lqg3;->a()Laa7;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    :cond_9
    return-object p0
.end method


# virtual methods
.method public final bridge synthetic L(Lx14;)Lx14;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ly14;->R(Lx14;)Lmo8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final R(Lx14;)Lmo8;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lt14;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    check-cast p1, Lt14;

    .line 10
    .line 11
    invoke-virtual {p1}, Lt14;->q0()Lmo8;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    instance-of v0, p1, Laa7;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, Laa7;

    .line 21
    .line 22
    invoke-static {v0}, Ly14;->S(Laa7;)Laa7;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    instance-of v0, p1, Lce2;

    .line 28
    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    move-object v0, p1

    .line 32
    check-cast v0, Lce2;

    .line 33
    .line 34
    iget-object v2, v0, Lce2;->Z:Laa7;

    .line 35
    .line 36
    iget-object v0, v0, Lce2;->Y:Laa7;

    .line 37
    .line 38
    invoke-static {v0}, Ly14;->S(Laa7;)Laa7;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v2}, Ly14;->S(Laa7;)Laa7;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    if-ne v3, v0, :cond_2

    .line 47
    .line 48
    if-eq v4, v2, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v0, p1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    invoke-static {v3, v4}, Ldh3;->s(Laa7;Laa7;)Lmo8;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_1
    new-instance v2, Ld0;

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/16 v9, 0x12

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    const-class v5, Ly14;

    .line 64
    .line 65
    const-string v6, "prepareType"

    .line 66
    .line 67
    const-string v7, "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;"

    .line 68
    .line 69
    move-object v4, p0

    .line 70
    invoke-direct/range {v2 .. v9}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Lc18;->e(Lt14;)Lt14;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v2, p0}, Ld0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    move-object v1, p0

    .line 84
    check-cast v1, Lt14;

    .line 85
    .line 86
    :cond_3
    invoke-static {v0, v1}, Lc18;->h(Lmo8;Lt14;)Lmo8;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 92
    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_5
    const-string p0, "Failed requirement."

    .line 96
    .line 97
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v1
.end method
