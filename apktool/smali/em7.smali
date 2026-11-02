.class public final synthetic Lem7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lm78;
.implements Lry0;
.implements Lzn2;


# static fields
.field public static final Y:Lem7;

.field public static final Z:Lem7;

.field public static final f0:Lem7;

.field public static final g0:Lem7;

.field public static final h0:Lem7;


# instance fields
.field public final synthetic X:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lem7;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lem7;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lem7;->Y:Lem7;

    .line 8
    .line 9
    new-instance v0, Lem7;

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-direct {v0, v1}, Lem7;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lem7;->Z:Lem7;

    .line 16
    .line 17
    new-instance v0, Lem7;

    .line 18
    .line 19
    const/4 v1, 0x7

    .line 20
    invoke-direct {v0, v1}, Lem7;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lem7;->f0:Lem7;

    .line 24
    .line 25
    new-instance v0, Lem7;

    .line 26
    .line 27
    const/16 v1, 0x8

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lem7;-><init>(B)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lem7;->g0:Lem7;

    .line 33
    .line 34
    new-instance v0, Lem7;

    .line 35
    .line 36
    const/16 v1, 0x9

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lem7;-><init>(B)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lem7;->h0:Lem7;

    .line 42
    .line 43
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lem7;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic a()Landroid/view/WindowInsets;
    .locals 1

    .line 1
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Cannot create TypeBindings for class "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public static synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    throw v0
.end method

.method public static synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Thread "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, Ljava/lang/AssertionError;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public static synthetic f(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static synthetic g(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public static synthetic i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public static synthetic j(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v3, 0xa

    .line 10
    .line 11
    invoke-static {v0, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_5

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lk49;

    .line 33
    .line 34
    iget-object v6, v3, Lk49;->b:Lu39;

    .line 35
    .line 36
    iget-object v4, v3, Lk49;->r:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const/4 v7, 0x0

    .line 43
    if-nez v5, :cond_0

    .line 44
    .line 45
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lu91;

    .line 50
    .line 51
    :goto_1
    move-object v9, v4

    .line 52
    goto :goto_2

    .line 53
    :cond_0
    sget-object v4, Lu91;->b:Lu91;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :goto_2
    new-instance v4, Lv39;

    .line 57
    .line 58
    iget-object v5, v3, Lk49;->a:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v5}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move v8, v7

    .line 68
    new-instance v7, Ljava/util/HashSet;

    .line 69
    .line 70
    iget-object v10, v3, Lk49;->p:Ljava/util/List;

    .line 71
    .line 72
    invoke-direct {v7, v10}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 73
    .line 74
    .line 75
    move v10, v8

    .line 76
    iget-object v8, v3, Lk49;->c:Lu91;

    .line 77
    .line 78
    iget v12, v3, Lk49;->h:I

    .line 79
    .line 80
    iget v11, v3, Lk49;->m:I

    .line 81
    .line 82
    iget-object v13, v3, Lk49;->g:Lp31;

    .line 83
    .line 84
    iget-wide v14, v3, Lk49;->d:J

    .line 85
    .line 86
    move/from16 v16, v11

    .line 87
    .line 88
    iget-wide v10, v3, Lk49;->e:J

    .line 89
    .line 90
    const-wide/16 v17, 0x0

    .line 91
    .line 92
    cmp-long v17, v10, v17

    .line 93
    .line 94
    if-eqz v17, :cond_1

    .line 95
    .line 96
    const/16 p1, 0x0

    .line 97
    .line 98
    new-instance v1, Lt39;

    .line 99
    .line 100
    move-object/from16 v28, v4

    .line 101
    .line 102
    move-object/from16 v29, v5

    .line 103
    .line 104
    iget-wide v4, v3, Lk49;->f:J

    .line 105
    .line 106
    invoke-direct {v1, v10, v11, v4, v5}, Lt39;-><init>(JJ)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_1
    move-object/from16 v28, v4

    .line 111
    .line 112
    move-object/from16 v29, v5

    .line 113
    .line 114
    const/16 p1, 0x0

    .line 115
    .line 116
    move-object/from16 v1, p1

    .line 117
    .line 118
    :goto_3
    sget-object v4, Lu39;->X:Lu39;

    .line 119
    .line 120
    if-ne v6, v4, :cond_4

    .line 121
    .line 122
    sget-object v5, Ll49;->z:Lem7;

    .line 123
    .line 124
    if-ne v6, v4, :cond_2

    .line 125
    .line 126
    if-lez v12, :cond_2

    .line 127
    .line 128
    move-wide/from16 v24, v10

    .line 129
    .line 130
    const/4 v11, 0x1

    .line 131
    :goto_4
    move-object v4, v13

    .line 132
    goto :goto_5

    .line 133
    :cond_2
    move-wide/from16 v24, v10

    .line 134
    .line 135
    const/4 v11, 0x0

    .line 136
    goto :goto_4

    .line 137
    :goto_5
    iget-object v13, v3, Lk49;->i:Lz00;

    .line 138
    .line 139
    move-wide/from16 v20, v14

    .line 140
    .line 141
    iget-wide v14, v3, Lk49;->j:J

    .line 142
    .line 143
    move-object v10, v6

    .line 144
    iget-wide v5, v3, Lk49;->k:J

    .line 145
    .line 146
    move-object/from16 v30, v0

    .line 147
    .line 148
    iget v0, v3, Lk49;->l:I

    .line 149
    .line 150
    if-eqz v17, :cond_3

    .line 151
    .line 152
    const/16 v19, 0x1

    .line 153
    .line 154
    :goto_6
    move/from16 v18, v0

    .line 155
    .line 156
    move-object/from16 p0, v1

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_3
    const/16 v19, 0x0

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :goto_7
    iget-wide v0, v3, Lk49;->f:J

    .line 163
    .line 164
    move-wide/from16 v22, v0

    .line 165
    .line 166
    iget-wide v0, v3, Lk49;->n:J

    .line 167
    .line 168
    move-wide/from16 v26, v0

    .line 169
    .line 170
    move/from16 v0, v16

    .line 171
    .line 172
    move-wide/from16 v16, v5

    .line 173
    .line 174
    invoke-static/range {v11 .. v27}, Lc18;->a(ZILz00;JJIZJJJJ)J

    .line 175
    .line 176
    .line 177
    move-result-wide v5

    .line 178
    :goto_8
    move-wide/from16 v16, v5

    .line 179
    .line 180
    goto :goto_9

    .line 181
    :cond_4
    move-object/from16 v30, v0

    .line 182
    .line 183
    move-object/from16 p0, v1

    .line 184
    .line 185
    move-object v10, v6

    .line 186
    move-object v4, v13

    .line 187
    move-wide/from16 v20, v14

    .line 188
    .line 189
    move/from16 v0, v16

    .line 190
    .line 191
    const-wide v5, 0x7fffffffffffffffL

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    goto :goto_8

    .line 197
    :goto_9
    iget v1, v3, Lk49;->o:I

    .line 198
    .line 199
    iget-object v3, v3, Lk49;->q:Ljava/lang/String;

    .line 200
    .line 201
    move-object/from16 v15, p0

    .line 202
    .line 203
    move v11, v0

    .line 204
    move/from16 v18, v1

    .line 205
    .line 206
    move-object/from16 v19, v3

    .line 207
    .line 208
    move-object v6, v10

    .line 209
    move v10, v12

    .line 210
    move-wide/from16 v13, v20

    .line 211
    .line 212
    move-object/from16 v5, v29

    .line 213
    .line 214
    move-object v12, v4

    .line 215
    move-object/from16 v4, v28

    .line 216
    .line 217
    invoke-direct/range {v4 .. v19}, Lv39;-><init>(Ljava/util/UUID;Lu39;Ljava/util/HashSet;Lu91;Lu91;IILp31;JLt39;JILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-object/from16 v0, v30

    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_5
    return-object v2

    .line 228
    :cond_6
    const/16 p1, 0x0

    .line 229
    .line 230
    return-object p1
.end method

.method public d(Ly5;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, Lem7;->X:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->a(Ly5;)Lue8;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->b(Ly5;)Lue8;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_1
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->c(Ly5;)Lue8;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
