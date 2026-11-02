.class public final Ldi;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# virtual methods
.method public a(J)I
    .locals 7

    .line 1
    iget v0, p0, Ldi;->a:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, Ldi;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [J

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    const/16 v3, 0xe

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-gt v0, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    mul-int/lit8 v2, v2, 0x2

    .line 17
    .line 18
    new-array v0, v2, [J

    .line 19
    .line 20
    new-array v2, v2, [I

    .line 21
    .line 22
    array-length v5, v1

    .line 23
    invoke-static {v1, v0, v4, v4, v5}, Leu;->f0([J[JIII)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Ldi;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, [I

    .line 29
    .line 30
    invoke-static {v4, v4, v3, v1, v2}, Leu;->h0(III[I[I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Ldi;->d:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object v2, p0, Ldi;->b:Ljava/lang/Object;

    .line 36
    .line 37
    :goto_0
    iget v0, p0, Ldi;->a:I

    .line 38
    .line 39
    add-int/lit8 v1, v0, 0x1

    .line 40
    .line 41
    iput v1, p0, Ldi;->a:I

    .line 42
    .line 43
    iget-object v1, p0, Ldi;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, [I

    .line 46
    .line 47
    array-length v2, v1

    .line 48
    iget v5, p0, Ldi;->c:I

    .line 49
    .line 50
    if-lt v5, v2, :cond_2

    .line 51
    .line 52
    mul-int/lit8 v2, v2, 0x2

    .line 53
    .line 54
    new-array v1, v2, [I

    .line 55
    .line 56
    move v5, v4

    .line 57
    :goto_1
    if-ge v5, v2, :cond_1

    .line 58
    .line 59
    add-int/lit8 v6, v5, 0x1

    .line 60
    .line 61
    aput v6, v1, v5

    .line 62
    .line 63
    move v5, v6

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget-object v2, p0, Ldi;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, [I

    .line 68
    .line 69
    invoke-static {v4, v4, v3, v2, v1}, Leu;->h0(III[I[I)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Ldi;->e:Ljava/lang/Object;

    .line 73
    .line 74
    :cond_2
    move-object v2, v1

    .line 75
    iget v3, p0, Ldi;->c:I

    .line 76
    .line 77
    aget v1, v1, v3

    .line 78
    .line 79
    iput v1, p0, Ldi;->c:I

    .line 80
    .line 81
    iget-object v1, p0, Ldi;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, [J

    .line 84
    .line 85
    aput-wide p1, v1, v0

    .line 86
    .line 87
    iget-object v4, p0, Ldi;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v4, [I

    .line 90
    .line 91
    aput v3, v4, v0

    .line 92
    .line 93
    aput v0, v2, v3

    .line 94
    .line 95
    :goto_2
    if-lez v0, :cond_3

    .line 96
    .line 97
    add-int/lit8 v2, v0, 0x1

    .line 98
    .line 99
    shr-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    add-int/lit8 v2, v2, -0x1

    .line 102
    .line 103
    aget-wide v4, v1, v2

    .line 104
    .line 105
    invoke-static {v4, v5, p1, p2}, Ldh3;->l(JJ)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-lez v4, :cond_3

    .line 110
    .line 111
    invoke-virtual {p0, v2, v0}, Ldi;->c(II)V

    .line 112
    .line 113
    .line 114
    move v0, v2

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    return v3
.end method

.method public b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F
    .locals 1

    .line 1
    iget-object v0, p0, Ldi;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/xmlpull/v1/XmlPullParser;

    .line 4
    .line 5
    invoke-static {v0, p2}, La28;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p1, p3, p4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Ldi;->d(I)V

    .line 21
    .line 22
    .line 23
    return p4
.end method

.method public c(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Ldi;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    iget-object v1, p0, Ldi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [I

    .line 8
    .line 9
    iget-object p0, p0, Ldi;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, [I

    .line 12
    .line 13
    aget-wide v2, v0, p1

    .line 14
    .line 15
    aget-wide v4, v0, p2

    .line 16
    .line 17
    aput-wide v4, v0, p1

    .line 18
    .line 19
    aput-wide v2, v0, p2

    .line 20
    .line 21
    aget v0, v1, p1

    .line 22
    .line 23
    aget v2, v1, p2

    .line 24
    .line 25
    aput v2, v1, p1

    .line 26
    .line 27
    aput v0, v1, p2

    .line 28
    .line 29
    aput p1, p0, v2

    .line 30
    .line 31
    aput p2, p0, v0

    .line 32
    .line 33
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldi;->a:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Ldi;->a:I

    .line 5
    .line 6
    return-void
.end method
