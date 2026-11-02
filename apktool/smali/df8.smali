.class public abstract Ldf8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public X:Lcf8;

.field public Y:[C

.field public Z:I

.field public f0:[I

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:I

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:I

.field public o0:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static c(II)I
    .locals 1

    .line 1
    const v0, 0x1000193

    .line 2
    .line 3
    .line 4
    mul-int/2addr p0, v0

    .line 5
    xor-int/2addr p0, p1

    .line 6
    return p0
.end method

.method public static d(II)I
    .locals 1

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    invoke-static {p0, v0}, Ldf8;->c(II)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    shr-int/lit8 v0, p1, 0x8

    .line 8
    .line 9
    and-int/lit16 v0, v0, 0xff

    .line 10
    .line 11
    invoke-static {p0, v0}, Ldf8;->c(II)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    shr-int/lit8 v0, p1, 0x10

    .line 16
    .line 17
    and-int/lit16 v0, v0, 0xff

    .line 18
    .line 19
    invoke-static {p0, v0}, Ldf8;->c(II)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    shr-int/lit8 p1, p1, 0x18

    .line 24
    .line 25
    and-int/lit16 p1, p1, 0xff

    .line 26
    .line 27
    invoke-static {p0, p1}, Ldf8;->c(II)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method


# virtual methods
.method public a(I)I
    .locals 3

    .line 1
    if-ltz p1, :cond_4

    .line 2
    .line 3
    const v0, 0xd800

    .line 4
    .line 5
    .line 6
    if-lt p1, v0, :cond_3

    .line 7
    .line 8
    const v1, 0xdbff

    .line 9
    .line 10
    .line 11
    const v2, 0xffff

    .line 12
    .line 13
    .line 14
    if-le p1, v1, :cond_0

    .line 15
    .line 16
    if-gt p1, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-gt p1, v2, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Ldf8;->Y:[C

    .line 22
    .line 23
    sub-int v0, p1, v0

    .line 24
    .line 25
    shr-int/lit8 v0, v0, 0x5

    .line 26
    .line 27
    add-int/lit16 v0, v0, 0x800

    .line 28
    .line 29
    aget-char v0, p0, v0

    .line 30
    .line 31
    shl-int/lit8 v0, v0, 0x2

    .line 32
    .line 33
    and-int/lit8 p1, p1, 0x1f

    .line 34
    .line 35
    add-int/2addr v0, p1

    .line 36
    aget-char p0, p0, v0

    .line 37
    .line 38
    return p0

    .line 39
    :cond_1
    iget v0, p0, Ldf8;->l0:I

    .line 40
    .line 41
    if-ge p1, v0, :cond_2

    .line 42
    .line 43
    shr-int/lit8 v0, p1, 0xb

    .line 44
    .line 45
    add-int/lit16 v0, v0, 0x820

    .line 46
    .line 47
    iget-object p0, p0, Ldf8;->Y:[C

    .line 48
    .line 49
    aget-char v0, p0, v0

    .line 50
    .line 51
    shr-int/lit8 v1, p1, 0x5

    .line 52
    .line 53
    and-int/lit8 v1, v1, 0x3f

    .line 54
    .line 55
    add-int/2addr v0, v1

    .line 56
    aget-char v0, p0, v0

    .line 57
    .line 58
    shl-int/lit8 v0, v0, 0x2

    .line 59
    .line 60
    and-int/lit8 p1, p1, 0x1f

    .line 61
    .line 62
    add-int/2addr v0, p1

    .line 63
    aget-char p0, p0, v0

    .line 64
    .line 65
    return p0

    .line 66
    :cond_2
    const v0, 0x10ffff

    .line 67
    .line 68
    .line 69
    if-gt p1, v0, :cond_4

    .line 70
    .line 71
    iget-object p1, p0, Ldf8;->Y:[C

    .line 72
    .line 73
    iget p0, p0, Ldf8;->m0:I

    .line 74
    .line 75
    aget-char p0, p1, p0

    .line 76
    .line 77
    return p0

    .line 78
    :cond_3
    :goto_0
    iget-object p0, p0, Ldf8;->Y:[C

    .line 79
    .line 80
    shr-int/lit8 v0, p1, 0x5

    .line 81
    .line 82
    aget-char v0, p0, v0

    .line 83
    .line 84
    shl-int/lit8 v0, v0, 0x2

    .line 85
    .line 86
    and-int/lit8 p1, p1, 0x1f

    .line 87
    .line 88
    add-int/2addr v0, p1

    .line 89
    aget-char p0, p0, v0

    .line 90
    .line 91
    return p0

    .line 92
    :cond_4
    iget p0, p0, Ldf8;->k0:I

    .line 93
    .line 94
    return p0
.end method

.method public b(C)I
    .locals 1

    .line 1
    iget-object p0, p0, Ldf8;->Y:[C

    .line 2
    .line 3
    shr-int/lit8 v0, p1, 0x5

    .line 4
    .line 5
    aget-char v0, p0, v0

    .line 6
    .line 7
    shl-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    and-int/lit8 p1, p1, 0x1f

    .line 10
    .line 11
    add-int/2addr v0, p1

    .line 12
    aget-char p0, p0, v0

    .line 13
    .line 14
    return p0
.end method

.method public e(II)I
    .locals 5

    .line 1
    :goto_0
    const/high16 v0, 0x110000

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    const v1, 0xd800

    .line 8
    .line 9
    .line 10
    if-lt p1, v1, :cond_4

    .line 11
    .line 12
    const v2, 0xdbff

    .line 13
    .line 14
    .line 15
    const v3, 0xffff

    .line 16
    .line 17
    .line 18
    if-le p1, v2, :cond_1

    .line 19
    .line 20
    if-gt p1, v3, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    if-ge p1, v3, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Ldf8;->Y:[C

    .line 26
    .line 27
    sub-int v1, p1, v1

    .line 28
    .line 29
    shr-int/lit8 v1, v1, 0x5

    .line 30
    .line 31
    const/16 v3, 0x800

    .line 32
    .line 33
    add-int/2addr v1, v3

    .line 34
    aget-char v1, v2, v1

    .line 35
    .line 36
    :goto_1
    shl-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_2
    iget v1, p0, Ldf8;->l0:I

    .line 40
    .line 41
    iget-object v2, p0, Ldf8;->Y:[C

    .line 42
    .line 43
    if-ge p1, v1, :cond_3

    .line 44
    .line 45
    shr-int/lit8 v1, p1, 0xb

    .line 46
    .line 47
    add-int/lit16 v1, v1, 0x820

    .line 48
    .line 49
    aget-char v3, v2, v1

    .line 50
    .line 51
    shr-int/lit8 v1, p1, 0x5

    .line 52
    .line 53
    and-int/lit8 v1, v1, 0x3f

    .line 54
    .line 55
    add-int/2addr v1, v3

    .line 56
    aget-char v1, v2, v1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget p0, p0, Ldf8;->m0:I

    .line 60
    .line 61
    aget-char p0, v2, p0

    .line 62
    .line 63
    if-ne p2, p0, :cond_9

    .line 64
    .line 65
    move p1, v0

    .line 66
    goto :goto_5

    .line 67
    :cond_4
    :goto_2
    iget-object v1, p0, Ldf8;->Y:[C

    .line 68
    .line 69
    shr-int/lit8 v2, p1, 0x5

    .line 70
    .line 71
    aget-char v1, v1, v2

    .line 72
    .line 73
    shl-int/lit8 v1, v1, 0x2

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    :goto_3
    iget v2, p0, Ldf8;->i0:I

    .line 77
    .line 78
    if-ne v3, v2, :cond_6

    .line 79
    .line 80
    iget v1, p0, Ldf8;->j0:I

    .line 81
    .line 82
    if-eq p2, v1, :cond_5

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_5
    add-int/lit16 p1, p1, 0x800

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_6
    iget v2, p0, Ldf8;->n0:I

    .line 89
    .line 90
    if-ne v1, v2, :cond_8

    .line 91
    .line 92
    iget v1, p0, Ldf8;->j0:I

    .line 93
    .line 94
    if-eq p2, v1, :cond_7

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_7
    add-int/lit8 p1, p1, 0x20

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_8
    and-int/lit8 v2, p1, 0x1f

    .line 101
    .line 102
    add-int/2addr v2, v1

    .line 103
    add-int/lit8 v1, v1, 0x20

    .line 104
    .line 105
    move v3, v2

    .line 106
    :goto_4
    if-ge v3, v1, :cond_c

    .line 107
    .line 108
    iget-object v4, p0, Ldf8;->Y:[C

    .line 109
    .line 110
    aget-char v4, v4, v3

    .line 111
    .line 112
    if-eq v4, p2, :cond_b

    .line 113
    .line 114
    sub-int/2addr v3, v2

    .line 115
    add-int/2addr p1, v3

    .line 116
    :cond_9
    :goto_5
    if-le p1, v0, :cond_a

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_a
    move v0, p1

    .line 120
    :goto_6
    add-int/lit8 v0, v0, -0x1

    .line 121
    .line 122
    return v0

    .line 123
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_c
    sub-int/2addr v1, v2

    .line 127
    add-int/2addr p1, v1

    .line 128
    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Ldf8;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Ldf8;

    .line 7
    .line 8
    new-instance v0, Llc7;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Llc7;-><init>(Ldf8;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Llc7;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Llc7;-><init>(Ldf8;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-virtual {v1}, Llc7;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-virtual {v1}, Llc7;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lbf8;

    .line 29
    .line 30
    invoke-virtual {v0}, Llc7;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {v0}, Llc7;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lbf8;

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Lbf8;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-virtual {v0}, Llc7;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    iget v0, p0, Ldf8;->k0:I

    .line 58
    .line 59
    iget v1, p1, Ldf8;->k0:I

    .line 60
    .line 61
    if-ne v0, v1, :cond_6

    .line 62
    .line 63
    iget p0, p0, Ldf8;->j0:I

    .line 64
    .line 65
    iget p1, p1, Ldf8;->j0:I

    .line 66
    .line 67
    if-eq p0, p1, :cond_5

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_5
    const/4 p0, 0x1

    .line 71
    return p0

    .line 72
    :cond_6
    :goto_0
    const/4 p0, 0x0

    .line 73
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Ldf8;->o0:I

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Llc7;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Llc7;-><init>(Ldf8;)V

    .line 8
    .line 9
    .line 10
    const v1, -0x7ee3623b

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-virtual {v0}, Llc7;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Llc7;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lbf8;

    .line 24
    .line 25
    invoke-virtual {v2}, Lbf8;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v1, v2}, Ldf8;->d(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    if-nez v1, :cond_1

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    :cond_1
    iput v1, p0, Ldf8;->o0:I

    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Llc7;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Llc7;-><init>(Ldf8;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
