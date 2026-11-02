.class public final Lfs3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:B

.field public b:I

.field public final c:I

.field public final d:Lfs3;

.field public e:Lz47;

.field public f:Lfs3;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/Object;

.field public i:Z


# direct methods
.method public constructor <init>(ILfs3;Lz47;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-byte p1, p0, Lfs3;->a:B

    .line 28
    iput-object p2, p0, Lfs3;->d:Lfs3;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 29
    :cond_0
    iget p1, p2, Lfs3;->c:I

    add-int/lit8 p1, p1, 0x1

    :goto_0
    iput p1, p0, Lfs3;->c:I

    .line 30
    iput-object p3, p0, Lfs3;->e:Lz47;

    const/4 p1, -0x1

    .line 31
    iput p1, p0, Lfs3;->b:I

    return-void
.end method

.method public constructor <init>(ILfs3;Lz47;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, Lfs3;->a:B

    .line 5
    .line 6
    iput-object p2, p0, Lfs3;->d:Lfs3;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget p1, p2, Lfs3;->c:I

    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    :goto_0
    iput p1, p0, Lfs3;->c:I

    .line 17
    .line 18
    iput-object p3, p0, Lfs3;->e:Lz47;

    .line 19
    .line 20
    const/4 p1, -0x1

    .line 21
    iput p1, p0, Lfs3;->b:I

    .line 22
    .line 23
    iput-object p4, p0, Lfs3;->h:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte p0, p0, Lfs3;->a:B

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    const-string p0, "?"

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "Object"

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    const-string p0, "Array"

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_2
    const-string p0, "root"

    .line 21
    .line 22
    return-object p0
.end method

.method public final b(Ljava/lang/String;)I
    .locals 5

    .line 1
    iget-byte v0, p0, Lfs3;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_9

    .line 5
    .line 6
    iget-boolean v0, p0, Lfs3;->i:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lfs3;->i:Z

    .line 14
    .line 15
    iput-object p1, p0, Lfs3;->g:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p0, Lfs3;->e:Lz47;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_7

    .line 21
    .line 22
    iget-object v3, v1, Lz47;->Y:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    iput-object p1, v1, Lz47;->Y:Ljava/lang/Object;

    .line 29
    .line 30
    :goto_0
    move v3, v2

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    :goto_1
    move v3, v0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iget-object v3, v1, Lz47;->f0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    iput-object p1, v1, Lz47;->f0:Ljava/lang/Object;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    iget-object v3, v1, Lz47;->g0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/util/HashSet;

    .line 59
    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    new-instance v3, Ljava/util/HashSet;

    .line 63
    .line 64
    const/16 v4, 0x10

    .line 65
    .line 66
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object v3, v1, Lz47;->g0:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v4, v1, Lz47;->Y:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v4, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    iget-object v3, v1, Lz47;->g0:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, Ljava/util/HashSet;

    .line 81
    .line 82
    iget-object v4, v1, Lz47;->f0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    :cond_5
    iget-object v3, v1, Lz47;->g0:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Ljava/util/HashSet;

    .line 92
    .line 93
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    xor-int/2addr v3, v0

    .line 98
    :goto_2
    if-nez v3, :cond_6

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_6
    iget-object p0, v1, Lz47;->Z:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Leq2;

    .line 104
    .line 105
    new-instance v0, Lpo3;

    .line 106
    .line 107
    const-string v1, "Duplicate field \'"

    .line 108
    .line 109
    const-string v2, "\'"

    .line 110
    .line 111
    invoke-static {v1, p1, v2}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {v0, p1, p0}, Lpo3;-><init>(Ljava/lang/String;Lro3;)V

    .line 116
    .line 117
    .line 118
    throw v0

    .line 119
    :cond_7
    :goto_3
    iget p0, p0, Lfs3;->b:I

    .line 120
    .line 121
    if-gez p0, :cond_8

    .line 122
    .line 123
    return v2

    .line 124
    :cond_8
    return v0

    .line 125
    :cond_9
    :goto_4
    const/4 p0, 0x4

    .line 126
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-byte v1, p0, Lfs3;->a:B

    .line 9
    .line 10
    if-eqz v1, :cond_7

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v1, v3, :cond_5

    .line 15
    .line 16
    const/16 v1, 0x7b

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lfs3;->g:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz p0, :cond_4

    .line 24
    .line 25
    const/16 v1, 0x22

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    sget-object v3, Lfq0;->f:[I

    .line 31
    .line 32
    array-length v4, v3

    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    :goto_0
    if-ge v2, v5, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-ge v6, v4, :cond_2

    .line 44
    .line 45
    aget v7, v3, v6

    .line 46
    .line 47
    if-nez v7, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const/16 v7, 0x5c

    .line 51
    .line 52
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    aget v7, v3, v6

    .line 56
    .line 57
    if-gez v7, :cond_1

    .line 58
    .line 59
    const-string v7, "u00"

    .line 60
    .line 61
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    sget-object v7, Lfq0;->a:[C

    .line 65
    .line 66
    shr-int/lit8 v8, v6, 0x4

    .line 67
    .line 68
    aget-char v8, v7, v8

    .line 69
    .line 70
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    and-int/lit8 v6, v6, 0xf

    .line 74
    .line 75
    aget-char v6, v7, v6

    .line 76
    .line 77
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_1
    int-to-char v6, v7

    .line 82
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    :goto_1
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    const/16 p0, 0x3f

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :goto_3
    const/16 p0, 0x7d

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    const/16 v1, 0x5b

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget p0, p0, Lfs3;->b:I

    .line 113
    .line 114
    if-gez p0, :cond_6

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    move v2, p0

    .line 118
    :goto_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const/16 p0, 0x5d

    .line 122
    .line 123
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_7
    const-string p0, "/"

    .line 128
    .line 129
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    :goto_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0
.end method
