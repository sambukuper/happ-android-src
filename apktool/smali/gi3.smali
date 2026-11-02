.class public final Lgi3;
.super Lld2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final d:Li66;


# direct methods
.method public constructor <init>(Li66;)V
    .locals 3

    .line 1
    iget v0, p1, Lld2;->b:I

    .line 2
    .line 3
    iget v1, p1, Lld2;->c:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {p0, v0, v1, v2}, Lld2;-><init>(IIB)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lgi3;->d:Li66;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final j()[B
    .locals 4

    .line 1
    iget-object v0, p0, Lgi3;->d:Li66;

    .line 2
    .line 3
    invoke-virtual {v0}, Li66;->j()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lld2;->b:I

    .line 8
    .line 9
    iget p0, p0, Lld2;->c:I

    .line 10
    .line 11
    mul-int/2addr v1, p0

    .line 12
    new-array p0, v1, [B

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    aget-byte v3, v0, v2

    .line 18
    .line 19
    and-int/lit16 v3, v3, 0xff

    .line 20
    .line 21
    rsub-int v3, v3, 0xff

    .line 22
    .line 23
    int-to-byte v3, v3

    .line 24
    aput-byte v3, p0, v2

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object p0
.end method

.method public final k(I[B)[B
    .locals 1

    .line 1
    iget-object v0, p0, Lgi3;->d:Li66;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Li66;->k(I[B)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p0, p0, Lld2;->b:I

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    :goto_0
    if-ge p2, p0, :cond_0

    .line 11
    .line 12
    aget-byte v0, p1, p2

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    rsub-int v0, v0, 0xff

    .line 17
    .line 18
    int-to-byte v0, v0

    .line 19
    aput-byte v0, p1, p2

    .line 20
    .line 21
    add-int/lit8 p2, p2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object p1
.end method
