.class public final Lt23;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/io/Serializable;

.field public e:Ljava/io/Serializable;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    .line 1
    iput-byte p1, p0, Lt23;->a:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string p1, ""

    .line 10
    .line 11
    iput-object p1, p0, Lt23;->d:Ljava/io/Serializable;

    .line 12
    .line 13
    iput-object p1, p0, Lt23;->e:Ljava/io/Serializable;

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    iput v0, p0, Lt23;->b:I

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lt23;->h:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La77;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lt23;->a:B

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {p0}, Lt23;->e()V

    .line 35
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {p0, v0, p1}, Lt23;->a([ILa77;)V

    return-void
.end method


# virtual methods
.method public a([ILa77;)V
    .locals 5

    .line 1
    iget v0, p0, Lt23;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    :cond_0
    iput-object p2, p0, Lt23;->c:Ljava/lang/Object;

    .line 9
    .line 10
    :cond_1
    iget-object v1, p0, Lt23;->d:Ljava/io/Serializable;

    .line 11
    .line 12
    check-cast v1, [[I

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    if-lt v0, v2, :cond_2

    .line 16
    .line 17
    add-int/lit8 v2, v0, 0xa

    .line 18
    .line 19
    new-array v3, v2, [[I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static {v1, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    iput-object v3, p0, Lt23;->d:Ljava/io/Serializable;

    .line 26
    .line 27
    new-array v1, v2, [La77;

    .line 28
    .line 29
    iget-object v2, p0, Lt23;->e:Ljava/io/Serializable;

    .line 30
    .line 31
    check-cast v2, [La77;

    .line 32
    .line 33
    invoke-static {v2, v4, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lt23;->e:Ljava/io/Serializable;

    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, Lt23;->d:Ljava/io/Serializable;

    .line 39
    .line 40
    check-cast v0, [[I

    .line 41
    .line 42
    iget v1, p0, Lt23;->b:I

    .line 43
    .line 44
    aput-object p1, v0, v1

    .line 45
    .line 46
    iget-object p1, p0, Lt23;->e:Ljava/io/Serializable;

    .line 47
    .line 48
    check-cast p1, [La77;

    .line 49
    .line 50
    aput-object p2, p1, v1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    iput v1, p0, Lt23;->b:I

    .line 55
    .line 56
    return-void
.end method

.method public b()Lu23;
    .locals 13

    .line 1
    iget-object v0, p0, Lt23;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Ljava/lang/String;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz v2, :cond_6

    .line 8
    .line 9
    iget-object v1, p0, Lt23;->d:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x7

    .line 15
    invoke-static {v1, v3, v3, v4}, Lk32;->k(Ljava/lang/String;III)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v5, p0, Lt23;->e:Ljava/io/Serializable;

    .line 20
    .line 21
    check-cast v5, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v5, v3, v3, v4}, Lk32;->k(Ljava/lang/String;III)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, p0, Lt23;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v6, :cond_5

    .line 32
    .line 33
    move v7, v4

    .line 34
    move-object v4, v5

    .line 35
    move-object v5, v6

    .line 36
    invoke-virtual {p0}, Lt23;->d()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    iget-object v8, p0, Lt23;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v8, Ljava/util/ArrayList;

    .line 43
    .line 44
    move v9, v7

    .line 45
    new-instance v7, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 v10, 0xa

    .line 48
    .line 49
    invoke-static {v8, v10}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-eqz v11, :cond_0

    .line 65
    .line 66
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    check-cast v11, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v11, v3, v3, v9}, Lk32;->k(Ljava/lang/String;III)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iget-object v8, p0, Lt23;->i:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v8, Ljava/util/ArrayList;

    .line 83
    .line 84
    if-eqz v8, :cond_3

    .line 85
    .line 86
    new-instance v11, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-static {v8, v10}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-eqz v10, :cond_2

    .line 104
    .line 105
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    check-cast v10, Ljava/lang/String;

    .line 110
    .line 111
    if-eqz v10, :cond_1

    .line 112
    .line 113
    const/4 v12, 0x3

    .line 114
    invoke-static {v10, v3, v3, v12}, Lk32;->k(Ljava/lang/String;III)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    goto :goto_2

    .line 119
    :cond_1
    move-object v10, v0

    .line 120
    :goto_2
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    move-object v8, v11

    .line 125
    goto :goto_3

    .line 126
    :cond_3
    move-object v8, v0

    .line 127
    :goto_3
    iget-object v10, p0, Lt23;->g:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v10, Ljava/lang/String;

    .line 130
    .line 131
    if-eqz v10, :cond_4

    .line 132
    .line 133
    invoke-static {v10, v3, v3, v9}, Lk32;->k(Ljava/lang/String;III)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :cond_4
    move-object v9, v0

    .line 138
    invoke-virtual {p0}, Lt23;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    move-object v3, v1

    .line 143
    new-instance v1, Lu23;

    .line 144
    .line 145
    invoke-direct/range {v1 .. v10}, Lu23;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :cond_5
    const-string p0, "host == null"

    .line 150
    .line 151
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_6
    const-string p0, "scheme == null"

    .line 156
    .line 157
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-object v0
.end method

.method public c()Lth7;
    .locals 1

    .line 1
    iget v0, p0, Lt23;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, Lth7;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lth7;-><init>(Lt23;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public d()I
    .locals 2

    .line 1
    iget v0, p0, Lt23;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object p0, p0, Lt23;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v0, "http"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x50

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v0, "https"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x1bb

    .line 34
    .line 35
    :cond_2
    :goto_0
    return v1
.end method

.method public e()V
    .locals 2

    .line 1
    new-instance v0, La77;

    .line 2
    .line 3
    invoke-direct {v0}, La77;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lt23;->c:Ljava/lang/Object;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v1, v0, [[I

    .line 11
    .line 12
    iput-object v1, p0, Lt23;->d:Ljava/io/Serializable;

    .line 13
    .line 14
    new-array v0, v0, [La77;

    .line 15
    .line 16
    iput-object v0, p0, Lt23;->e:Ljava/io/Serializable;

    .line 17
    .line 18
    return-void
.end method

.method public f(Lu23;Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lt23;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    sget-object v4, Lks8;->a:[B

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-static {v2, v5, v4}, Lks8;->l(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-static {v2, v4, v6}, Lks8;->m(Ljava/lang/String;II)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    sub-int v7, v6, v4

    .line 31
    .line 32
    const/16 v8, 0x5b

    .line 33
    .line 34
    const/16 v9, 0x3a

    .line 35
    .line 36
    const/4 v10, -0x1

    .line 37
    const/4 v11, 0x2

    .line 38
    if-ge v7, v11, :cond_1

    .line 39
    .line 40
    :cond_0
    :goto_0
    move v7, v10

    .line 41
    goto :goto_3

    .line 42
    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    const/16 v12, 0x61

    .line 47
    .line 48
    invoke-static {v7, v12}, Ldh3;->k(II)I

    .line 49
    .line 50
    .line 51
    move-result v13

    .line 52
    const/16 v14, 0x41

    .line 53
    .line 54
    if-ltz v13, :cond_2

    .line 55
    .line 56
    const/16 v13, 0x7a

    .line 57
    .line 58
    invoke-static {v7, v13}, Ldh3;->k(II)I

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    if-lez v13, :cond_3

    .line 63
    .line 64
    :cond_2
    invoke-static {v7, v14}, Ldh3;->k(II)I

    .line 65
    .line 66
    .line 67
    move-result v13

    .line 68
    if-ltz v13, :cond_0

    .line 69
    .line 70
    const/16 v13, 0x5a

    .line 71
    .line 72
    invoke-static {v7, v13}, Ldh3;->k(II)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-lez v7, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    add-int/lit8 v7, v4, 0x1

    .line 80
    .line 81
    :goto_1
    if-ge v7, v6, :cond_0

    .line 82
    .line 83
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    if-gt v12, v13, :cond_4

    .line 88
    .line 89
    const/16 v15, 0x7b

    .line 90
    .line 91
    if-ge v13, v15, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    if-gt v14, v13, :cond_5

    .line 95
    .line 96
    if-ge v13, v8, :cond_5

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    const/16 v15, 0x30

    .line 100
    .line 101
    if-gt v15, v13, :cond_6

    .line 102
    .line 103
    if-ge v13, v9, :cond_6

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    const/16 v15, 0x2b

    .line 107
    .line 108
    if-ne v13, v15, :cond_7

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    const/16 v15, 0x2d

    .line 112
    .line 113
    if-ne v13, v15, :cond_8

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_8
    const/16 v15, 0x2e

    .line 117
    .line 118
    if-ne v13, v15, :cond_9

    .line 119
    .line 120
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_9
    if-ne v13, v9, :cond_0

    .line 124
    .line 125
    :goto_3
    const-string v12, "http"

    .line 126
    .line 127
    const-string v13, "https"

    .line 128
    .line 129
    const/4 v14, 0x1

    .line 130
    if-eq v7, v10, :cond_c

    .line 131
    .line 132
    const-string v15, "https:"

    .line 133
    .line 134
    invoke-static {v2, v15, v4, v14}, Lmm7;->Y(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 135
    .line 136
    .line 137
    move-result v15

    .line 138
    if-eqz v15, :cond_a

    .line 139
    .line 140
    iput-object v13, v0, Lt23;->c:Ljava/lang/Object;

    .line 141
    .line 142
    add-int/lit8 v4, v4, 0x6

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_a
    const-string v15, "http:"

    .line 146
    .line 147
    invoke-static {v2, v15, v4, v14}, Lmm7;->Y(Ljava/lang/String;Ljava/lang/String;IZ)Z

    .line 148
    .line 149
    .line 150
    move-result v15

    .line 151
    if-eqz v15, :cond_b

    .line 152
    .line 153
    iput-object v12, v0, Lt23;->c:Ljava/lang/Object;

    .line 154
    .line 155
    add-int/lit8 v4, v4, 0x5

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 159
    .line 160
    invoke-virtual {v2, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-instance v2, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 167
    .line 168
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const/16 v1, 0x27

    .line 175
    .line 176
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :cond_c
    if-eqz v1, :cond_33

    .line 188
    .line 189
    iget-object v7, v1, Lu23;->a:Ljava/lang/String;

    .line 190
    .line 191
    iput-object v7, v0, Lt23;->c:Ljava/lang/Object;

    .line 192
    .line 193
    :goto_4
    move v7, v4

    .line 194
    move v15, v5

    .line 195
    move/from16 v16, v14

    .line 196
    .line 197
    :goto_5
    const/16 v14, 0x2f

    .line 198
    .line 199
    const/16 v8, 0x5c

    .line 200
    .line 201
    if-ge v7, v6, :cond_e

    .line 202
    .line 203
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eq v9, v8, :cond_d

    .line 208
    .line 209
    if-ne v9, v14, :cond_e

    .line 210
    .line 211
    :cond_d
    add-int/lit8 v15, v15, 0x1

    .line 212
    .line 213
    add-int/lit8 v7, v7, 0x1

    .line 214
    .line 215
    const/16 v8, 0x5b

    .line 216
    .line 217
    const/16 v9, 0x3a

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_e
    const-string v7, " \"\'<>#"

    .line 221
    .line 222
    const-string v9, ""

    .line 223
    .line 224
    const/16 v8, 0x23

    .line 225
    .line 226
    if-ge v15, v11, :cond_12

    .line 227
    .line 228
    if-eqz v1, :cond_12

    .line 229
    .line 230
    iget-object v11, v1, Lu23;->a:Ljava/lang/String;

    .line 231
    .line 232
    iget-object v14, v0, Lt23;->c:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v14, Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {v11, v14}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    if-nez v11, :cond_f

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_f
    invoke-virtual {v1}, Lu23;->e()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    iput-object v10, v0, Lt23;->d:Ljava/io/Serializable;

    .line 248
    .line 249
    invoke-virtual {v1}, Lu23;->a()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    iput-object v10, v0, Lt23;->e:Ljava/io/Serializable;

    .line 254
    .line 255
    iget-object v10, v1, Lu23;->d:Ljava/lang/String;

    .line 256
    .line 257
    iput-object v10, v0, Lt23;->f:Ljava/lang/Object;

    .line 258
    .line 259
    iget v10, v1, Lu23;->e:I

    .line 260
    .line 261
    iput v10, v0, Lt23;->b:I

    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Lu23;->c()Ljava/util/ArrayList;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 271
    .line 272
    .line 273
    if-eq v4, v6, :cond_10

    .line 274
    .line 275
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    if-ne v10, v8, :cond_23

    .line 280
    .line 281
    :cond_10
    invoke-virtual {v1}, Lu23;->d()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    if-eqz v1, :cond_11

    .line 286
    .line 287
    const/16 v10, 0xd3

    .line 288
    .line 289
    invoke-static {v1, v5, v5, v10, v7}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-static {v1}, Lk32;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    goto :goto_6

    .line 298
    :cond_11
    const/4 v1, 0x0

    .line 299
    :goto_6
    iput-object v1, v0, Lt23;->i:Ljava/lang/Object;

    .line 300
    .line 301
    goto/16 :goto_12

    .line 302
    .line 303
    :cond_12
    :goto_7
    add-int/2addr v4, v15

    .line 304
    move v1, v5

    .line 305
    move v11, v1

    .line 306
    :goto_8
    const-string v14, "@/\\?#"

    .line 307
    .line 308
    invoke-static {v2, v14, v4, v6}, Lks8;->f(Ljava/lang/String;Ljava/lang/String;II)I

    .line 309
    .line 310
    .line 311
    move-result v14

    .line 312
    if-eq v14, v6, :cond_13

    .line 313
    .line 314
    invoke-virtual {v2, v14}, Ljava/lang/String;->charAt(I)C

    .line 315
    .line 316
    .line 317
    move-result v15

    .line 318
    goto :goto_9

    .line 319
    :cond_13
    move v15, v10

    .line 320
    :goto_9
    if-eq v15, v10, :cond_18

    .line 321
    .line 322
    if-eq v15, v8, :cond_18

    .line 323
    .line 324
    const/16 v5, 0x2f

    .line 325
    .line 326
    if-eq v15, v5, :cond_18

    .line 327
    .line 328
    const/16 v5, 0x5c

    .line 329
    .line 330
    if-eq v15, v5, :cond_18

    .line 331
    .line 332
    const/16 v5, 0x3f

    .line 333
    .line 334
    if-eq v15, v5, :cond_18

    .line 335
    .line 336
    const/16 v5, 0x40

    .line 337
    .line 338
    if-eq v15, v5, :cond_14

    .line 339
    .line 340
    const/4 v5, 0x0

    .line 341
    goto :goto_8

    .line 342
    :cond_14
    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    .line 343
    .line 344
    const-string v15, "%40"

    .line 345
    .line 346
    if-nez v1, :cond_17

    .line 347
    .line 348
    const/16 v8, 0x3a

    .line 349
    .line 350
    invoke-static {v2, v8, v4, v14}, Lks8;->e(Ljava/lang/String;CII)I

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    const/16 v8, 0xf0

    .line 355
    .line 356
    invoke-static {v2, v4, v10, v8, v5}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    if-eqz v11, :cond_15

    .line 361
    .line 362
    new-instance v8, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    iget-object v11, v0, Lt23;->d:Ljava/io/Serializable;

    .line 365
    .line 366
    check-cast v11, Ljava/lang/String;

    .line 367
    .line 368
    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-static {v8, v15, v4}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    :cond_15
    iput-object v4, v0, Lt23;->d:Ljava/io/Serializable;

    .line 376
    .line 377
    if-eq v10, v14, :cond_16

    .line 378
    .line 379
    add-int/lit8 v10, v10, 0x1

    .line 380
    .line 381
    const/16 v8, 0xf0

    .line 382
    .line 383
    invoke-static {v2, v10, v14, v8, v5}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    iput-object v1, v0, Lt23;->e:Ljava/io/Serializable;

    .line 388
    .line 389
    move/from16 v1, v16

    .line 390
    .line 391
    goto :goto_a

    .line 392
    :cond_16
    const/16 v8, 0xf0

    .line 393
    .line 394
    :goto_a
    move/from16 v11, v16

    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_17
    const/16 v8, 0xf0

    .line 398
    .line 399
    new-instance v10, Ljava/lang/StringBuilder;

    .line 400
    .line 401
    iget-object v8, v0, Lt23;->e:Ljava/io/Serializable;

    .line 402
    .line 403
    check-cast v8, Ljava/lang/String;

    .line 404
    .line 405
    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    const/16 v8, 0xf0

    .line 412
    .line 413
    invoke-static {v2, v4, v14, v8, v5}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    iput-object v4, v0, Lt23;->e:Ljava/io/Serializable;

    .line 425
    .line 426
    :goto_b
    add-int/lit8 v4, v14, 0x1

    .line 427
    .line 428
    const/4 v5, 0x0

    .line 429
    const/16 v8, 0x23

    .line 430
    .line 431
    const/4 v10, -0x1

    .line 432
    goto :goto_8

    .line 433
    :cond_18
    move v1, v4

    .line 434
    :goto_c
    if-ge v1, v14, :cond_1d

    .line 435
    .line 436
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    const/16 v8, 0x5b

    .line 441
    .line 442
    if-ne v5, v8, :cond_1b

    .line 443
    .line 444
    :cond_19
    add-int/lit8 v1, v1, 0x1

    .line 445
    .line 446
    if-ge v1, v14, :cond_1a

    .line 447
    .line 448
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    const/16 v10, 0x5d

    .line 453
    .line 454
    if-ne v5, v10, :cond_19

    .line 455
    .line 456
    :cond_1a
    const/16 v10, 0x3a

    .line 457
    .line 458
    goto :goto_d

    .line 459
    :cond_1b
    const/16 v10, 0x3a

    .line 460
    .line 461
    if-ne v5, v10, :cond_1c

    .line 462
    .line 463
    goto :goto_e

    .line 464
    :cond_1c
    :goto_d
    add-int/lit8 v1, v1, 0x1

    .line 465
    .line 466
    goto :goto_c

    .line 467
    :cond_1d
    move v1, v14

    .line 468
    :goto_e
    add-int/lit8 v5, v1, 0x1

    .line 469
    .line 470
    const/4 v8, 0x4

    .line 471
    const/16 v10, 0x22

    .line 472
    .line 473
    if-ge v5, v14, :cond_20

    .line 474
    .line 475
    invoke-static {v2, v4, v1, v8}, Lk32;->k(Ljava/lang/String;III)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v8

    .line 479
    invoke-static {v8}, Lnr4;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    iput-object v8, v0, Lt23;->f:Ljava/lang/Object;

    .line 484
    .line 485
    const/16 v8, 0xf8

    .line 486
    .line 487
    :try_start_0
    invoke-static {v2, v5, v14, v8, v9}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v8

    .line 491
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 492
    .line 493
    .line 494
    move-result v8
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 495
    move/from16 v11, v16

    .line 496
    .line 497
    if-gt v11, v8, :cond_1e

    .line 498
    .line 499
    const/high16 v11, 0x10000

    .line 500
    .line 501
    if-ge v8, v11, :cond_1e

    .line 502
    .line 503
    goto :goto_f

    .line 504
    :catch_0
    :cond_1e
    const/4 v8, -0x1

    .line 505
    :goto_f
    iput v8, v0, Lt23;->b:I

    .line 506
    .line 507
    const/4 v11, -0x1

    .line 508
    if-eq v8, v11, :cond_1f

    .line 509
    .line 510
    goto :goto_11

    .line 511
    :cond_1f
    const-string v0, "Invalid URL port: \""

    .line 512
    .line 513
    invoke-virtual {v2, v5, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-static {v10, v1, v0}, Lu52;->f(ILjava/lang/Object;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    return-void

    .line 521
    :cond_20
    const/4 v11, -0x1

    .line 522
    invoke-static {v2, v4, v1, v8}, Lk32;->k(Ljava/lang/String;III)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    invoke-static {v5}, Lnr4;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v5

    .line 530
    iput-object v5, v0, Lt23;->f:Ljava/lang/Object;

    .line 531
    .line 532
    iget-object v5, v0, Lt23;->c:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v5, Ljava/lang/String;

    .line 535
    .line 536
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v5, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v8

    .line 543
    if-eqz v8, :cond_21

    .line 544
    .line 545
    const/16 v5, 0x50

    .line 546
    .line 547
    goto :goto_10

    .line 548
    :cond_21
    invoke-virtual {v5, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v5

    .line 552
    if-eqz v5, :cond_22

    .line 553
    .line 554
    const/16 v5, 0x1bb

    .line 555
    .line 556
    goto :goto_10

    .line 557
    :cond_22
    move v5, v11

    .line 558
    :goto_10
    iput v5, v0, Lt23;->b:I

    .line 559
    .line 560
    :goto_11
    iget-object v5, v0, Lt23;->f:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v5, Ljava/lang/String;

    .line 563
    .line 564
    if-eqz v5, :cond_32

    .line 565
    .line 566
    move v4, v14

    .line 567
    :cond_23
    :goto_12
    const-string v1, "?#"

    .line 568
    .line 569
    invoke-static {v2, v1, v4, v6}, Lks8;->f(Ljava/lang/String;Ljava/lang/String;II)I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-ne v4, v1, :cond_24

    .line 574
    .line 575
    goto/16 :goto_19

    .line 576
    .line 577
    :cond_24
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    const/16 v8, 0x2f

    .line 582
    .line 583
    if-eq v5, v8, :cond_26

    .line 584
    .line 585
    const/16 v8, 0x5c

    .line 586
    .line 587
    if-ne v5, v8, :cond_25

    .line 588
    .line 589
    goto :goto_13

    .line 590
    :cond_25
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    const/16 v16, 0x1

    .line 595
    .line 596
    add-int/lit8 v5, v5, -0x1

    .line 597
    .line 598
    invoke-virtual {v3, v5, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    goto :goto_14

    .line 602
    :cond_26
    :goto_13
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    add-int/lit8 v4, v4, 0x1

    .line 609
    .line 610
    :goto_14
    if-ge v4, v1, :cond_2f

    .line 611
    .line 612
    const-string v5, "/\\"

    .line 613
    .line 614
    invoke-static {v2, v5, v4, v1}, Lks8;->f(Ljava/lang/String;Ljava/lang/String;II)I

    .line 615
    .line 616
    .line 617
    move-result v5

    .line 618
    if-ge v5, v1, :cond_27

    .line 619
    .line 620
    const/4 v11, 0x1

    .line 621
    goto :goto_15

    .line 622
    :cond_27
    const/4 v11, 0x0

    .line 623
    :goto_15
    const-string v8, " \"<>^`{}|/\\?#"

    .line 624
    .line 625
    const/16 v10, 0xf0

    .line 626
    .line 627
    invoke-static {v2, v4, v5, v10, v8}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    const-string v8, "."

    .line 632
    .line 633
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v8

    .line 637
    if-nez v8, :cond_2d

    .line 638
    .line 639
    const-string v8, "%2e"

    .line 640
    .line 641
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 642
    .line 643
    .line 644
    move-result v8

    .line 645
    if-eqz v8, :cond_28

    .line 646
    .line 647
    goto :goto_18

    .line 648
    :cond_28
    const-string v8, ".."

    .line 649
    .line 650
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v8

    .line 654
    if-nez v8, :cond_2b

    .line 655
    .line 656
    const-string v8, "%2e."

    .line 657
    .line 658
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 659
    .line 660
    .line 661
    move-result v8

    .line 662
    if-nez v8, :cond_2b

    .line 663
    .line 664
    const-string v8, ".%2e"

    .line 665
    .line 666
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 667
    .line 668
    .line 669
    move-result v8

    .line 670
    if-nez v8, :cond_2b

    .line 671
    .line 672
    const-string v8, "%2e%2e"

    .line 673
    .line 674
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 675
    .line 676
    .line 677
    move-result v8

    .line 678
    if-eqz v8, :cond_29

    .line 679
    .line 680
    goto :goto_17

    .line 681
    :cond_29
    const/4 v8, 0x1

    .line 682
    invoke-static {v8, v3}, Loi0;->h(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v12

    .line 686
    check-cast v12, Ljava/lang/CharSequence;

    .line 687
    .line 688
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 689
    .line 690
    .line 691
    move-result v12

    .line 692
    if-nez v12, :cond_2a

    .line 693
    .line 694
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 695
    .line 696
    .line 697
    move-result v12

    .line 698
    sub-int/2addr v12, v8

    .line 699
    invoke-virtual {v3, v12, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    goto :goto_16

    .line 703
    :cond_2a
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    :goto_16
    if-eqz v11, :cond_2d

    .line 707
    .line 708
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    goto :goto_18

    .line 712
    :cond_2b
    :goto_17
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 713
    .line 714
    .line 715
    move-result v4

    .line 716
    const/16 v16, 0x1

    .line 717
    .line 718
    add-int/lit8 v4, v4, -0x1

    .line 719
    .line 720
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v4

    .line 724
    check-cast v4, Ljava/lang/String;

    .line 725
    .line 726
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 727
    .line 728
    .line 729
    move-result v4

    .line 730
    if-nez v4, :cond_2c

    .line 731
    .line 732
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 733
    .line 734
    .line 735
    move-result v4

    .line 736
    if-nez v4, :cond_2c

    .line 737
    .line 738
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 739
    .line 740
    .line 741
    move-result v4

    .line 742
    add-int/lit8 v4, v4, -0x1

    .line 743
    .line 744
    invoke-virtual {v3, v4, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    goto :goto_18

    .line 748
    :cond_2c
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    :cond_2d
    :goto_18
    if-eqz v11, :cond_2e

    .line 752
    .line 753
    add-int/lit8 v4, v5, 0x1

    .line 754
    .line 755
    goto/16 :goto_14

    .line 756
    .line 757
    :cond_2e
    move v4, v5

    .line 758
    goto/16 :goto_14

    .line 759
    .line 760
    :cond_2f
    :goto_19
    if-ge v1, v6, :cond_30

    .line 761
    .line 762
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 763
    .line 764
    .line 765
    move-result v3

    .line 766
    const/16 v5, 0x3f

    .line 767
    .line 768
    if-ne v3, v5, :cond_30

    .line 769
    .line 770
    const/16 v3, 0x23

    .line 771
    .line 772
    invoke-static {v2, v3, v1, v6}, Lks8;->e(Ljava/lang/String;CII)I

    .line 773
    .line 774
    .line 775
    move-result v4

    .line 776
    add-int/lit8 v1, v1, 0x1

    .line 777
    .line 778
    const/16 v3, 0xd0

    .line 779
    .line 780
    invoke-static {v2, v1, v4, v3, v7}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v1

    .line 784
    invoke-static {v1}, Lk32;->m(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    iput-object v1, v0, Lt23;->i:Ljava/lang/Object;

    .line 789
    .line 790
    move v1, v4

    .line 791
    :cond_30
    if-ge v1, v6, :cond_31

    .line 792
    .line 793
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 794
    .line 795
    .line 796
    move-result v3

    .line 797
    const/16 v4, 0x23

    .line 798
    .line 799
    if-ne v3, v4, :cond_31

    .line 800
    .line 801
    const/16 v16, 0x1

    .line 802
    .line 803
    add-int/lit8 v1, v1, 0x1

    .line 804
    .line 805
    const/16 v3, 0xb0

    .line 806
    .line 807
    invoke-static {v2, v1, v6, v3, v9}, Lk32;->b(Ljava/lang/String;IIILjava/lang/String;)Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v1

    .line 811
    iput-object v1, v0, Lt23;->g:Ljava/lang/Object;

    .line 812
    .line 813
    :cond_31
    return-void

    .line 814
    :cond_32
    const-string v0, "Invalid URL host: \""

    .line 815
    .line 816
    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v1

    .line 820
    invoke-static {v10, v1, v0}, Lu52;->f(ILjava/lang/Object;Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    return-void

    .line 824
    :cond_33
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    const/4 v1, 0x6

    .line 829
    if-le v0, v1, :cond_34

    .line 830
    .line 831
    invoke-static {v1, v2}, Lfm7;->Q0(ILjava/lang/String;)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    const-string v1, "..."

    .line 836
    .line 837
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    goto :goto_1a

    .line 842
    :cond_34
    move-object v0, v2

    .line 843
    :goto_1a
    const-string v1, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 844
    .line 845
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-byte v0, p0, Lt23;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lt23;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "://"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "//"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, Lt23;->d:Ljava/io/Serializable;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/16 v2, 0x3a

    .line 45
    .line 46
    if-lez v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v1, p0, Lt23;->e:Ljava/io/Serializable;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    :goto_1
    iget-object v1, p0, Lt23;->d:Ljava/io/Serializable;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lt23;->e:Ljava/io/Serializable;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-lez v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lt23;->e:Ljava/io/Serializable;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    :cond_2
    const/16 v1, 0x40

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object v1, p0, Lt23;->f:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    invoke-static {v1, v2}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/16 v1, 0x5b

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lt23;->f:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/16 v1, 0x5d

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iget-object v1, p0, Lt23;->f:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_2
    iget v1, p0, Lt23;->b:I

    .line 129
    .line 130
    const/4 v3, -0x1

    .line 131
    if-ne v1, v3, :cond_6

    .line 132
    .line 133
    iget-object v1, p0, Lt23;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v1, :cond_a

    .line 138
    .line 139
    :cond_6
    invoke-virtual {p0}, Lt23;->d()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget-object v4, p0, Lt23;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v4, :cond_9

    .line 148
    .line 149
    const-string v5, "http"

    .line 150
    .line 151
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_7

    .line 156
    .line 157
    const/16 v3, 0x50

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    const-string v5, "https"

    .line 161
    .line 162
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_8

    .line 167
    .line 168
    const/16 v3, 0x1bb

    .line 169
    .line 170
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 171
    .line 172
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    :cond_a
    iget-object v1, p0, Lt23;->h:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const/4 v3, 0x0

    .line 187
    move v4, v3

    .line 188
    :goto_4
    if-ge v4, v2, :cond_b

    .line 189
    .line 190
    const/16 v5, 0x2f

    .line 191
    .line 192
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    check-cast v5, Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    add-int/lit8 v4, v4, 0x1

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_b
    iget-object v1, p0, Lt23;->i:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Ljava/util/ArrayList;

    .line 210
    .line 211
    if-eqz v1, :cond_10

    .line 212
    .line 213
    const/16 v1, 0x3f

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    iget-object v1, p0, Lt23;->i:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    invoke-static {v3, v2}, Lx97;->a0(II)Lkf3;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const/4 v3, 0x2

    .line 234
    invoke-static {v2, v3}, Lx97;->W(Lkf3;I)Lif3;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    iget v3, v2, Lif3;->X:I

    .line 239
    .line 240
    iget v4, v2, Lif3;->Y:I

    .line 241
    .line 242
    iget v2, v2, Lif3;->Z:I

    .line 243
    .line 244
    if-lez v2, :cond_c

    .line 245
    .line 246
    if-le v3, v4, :cond_d

    .line 247
    .line 248
    :cond_c
    if-gez v2, :cond_10

    .line 249
    .line 250
    if-gt v4, v3, :cond_10

    .line 251
    .line 252
    :cond_d
    :goto_5
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    check-cast v5, Ljava/lang/String;

    .line 257
    .line 258
    add-int/lit8 v6, v3, 0x1

    .line 259
    .line 260
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    check-cast v6, Ljava/lang/String;

    .line 265
    .line 266
    if-lez v3, :cond_e

    .line 267
    .line 268
    const/16 v7, 0x26

    .line 269
    .line 270
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    :cond_e
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    if-eqz v6, :cond_f

    .line 277
    .line 278
    const/16 v5, 0x3d

    .line 279
    .line 280
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    :cond_f
    if-eq v3, v4, :cond_10

    .line 287
    .line 288
    add-int/2addr v3, v2

    .line 289
    goto :goto_5

    .line 290
    :cond_10
    iget-object v1, p0, Lt23;->g:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v1, Ljava/lang/String;

    .line 293
    .line 294
    if-eqz v1, :cond_11

    .line 295
    .line 296
    const/16 v1, 0x23

    .line 297
    .line 298
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    iget-object p0, p0, Lt23;->g:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast p0, Ljava/lang/String;

    .line 304
    .line 305
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    :cond_11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    return-object p0

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
