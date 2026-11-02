.class public final Li66;
.super Lld2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final d:[B

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(II[I)V
    .locals 6

    .line 1
    mul-int v0, p1, p2

    .line 2
    .line 3
    array-length v1, p3

    .line 4
    if-lt v1, v0, :cond_1

    .line 5
    .line 6
    new-array v1, v0, [B

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    aget v3, p3, v2

    .line 12
    .line 13
    shr-int/lit8 v4, v3, 0x10

    .line 14
    .line 15
    and-int/lit16 v4, v4, 0xff

    .line 16
    .line 17
    shr-int/lit8 v5, v3, 0x7

    .line 18
    .line 19
    and-int/lit16 v5, v5, 0x1fe

    .line 20
    .line 21
    and-int/lit16 v3, v3, 0xff

    .line 22
    .line 23
    add-int/2addr v4, v5

    .line 24
    add-int/2addr v4, v3

    .line 25
    div-int/lit8 v4, v4, 0x4

    .line 26
    .line 27
    int-to-byte v3, v4

    .line 28
    aput-byte v3, v1, v2

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p3, 0x2

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lld2;-><init>(IIB)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Li66;->d:[B

    .line 38
    .line 39
    iput p1, p0, Li66;->e:I

    .line 40
    .line 41
    iput p2, p0, Li66;->f:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    const-string p0, "Pixel array length is less than width * height"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    throw p0
.end method


# virtual methods
.method public final j()[B
    .locals 7

    .line 1
    iget v0, p0, Lld2;->b:I

    .line 2
    .line 3
    iget v1, p0, Lld2;->c:I

    .line 4
    .line 5
    iget-object v2, p0, Li66;->d:[B

    .line 6
    .line 7
    iget v3, p0, Li66;->e:I

    .line 8
    .line 9
    if-ne v0, v3, :cond_0

    .line 10
    .line 11
    iget p0, p0, Li66;->f:I

    .line 12
    .line 13
    if-ne v1, p0, :cond_0

    .line 14
    .line 15
    return-object v2

    .line 16
    :cond_0
    mul-int p0, v0, v1

    .line 17
    .line 18
    new-array v4, p0, [B

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    if-ne v0, v3, :cond_1

    .line 22
    .line 23
    invoke-static {v2, v5, v4, v5, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    return-object v4

    .line 27
    :cond_1
    move p0, v5

    .line 28
    :goto_0
    if-ge v5, v1, :cond_2

    .line 29
    .line 30
    mul-int v6, v5, v0

    .line 31
    .line 32
    invoke-static {v2, p0, v4, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    add-int/2addr p0, v3

    .line 36
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-object v4
.end method

.method public final k(I[B)[B
    .locals 2

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    iget v0, p0, Lld2;->c:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_2

    .line 6
    .line 7
    iget v0, p0, Lld2;->b:I

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    array-length v1, p2

    .line 12
    if-ge v1, v0, :cond_1

    .line 13
    .line 14
    :cond_0
    new-array p2, v0, [B

    .line 15
    .line 16
    :cond_1
    iget v1, p0, Li66;->e:I

    .line 17
    .line 18
    mul-int/2addr p1, v1

    .line 19
    iget-object p0, p0, Li66;->d:[B

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {p0, p1, p2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    :cond_2
    const-string p0, "Requested row is outside the image: "

    .line 27
    .line 28
    invoke-static {p1, p0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method
