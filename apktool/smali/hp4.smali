.class public abstract Lhp4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public X:I

.field public Y:I

.field public Z:I

.field public f0:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lf08;->Y:Lf08;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    new-instance p0, Lf08;

    .line 9
    .line 10
    const/16 v0, 0xa

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lf08;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object p0, Lf08;->Y:Lf08;

    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .line 1
    iget v0, p0, Lhp4;->Z:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lhp4;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iget p0, p0, Lhp4;->Y:I

    .line 10
    .line 11
    add-int/2addr p0, p1

    .line 12
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhp4;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lip4;

    .line 4
    .line 5
    iget v0, v0, Lip4;->j0:I

    .line 6
    .line 7
    iget p0, p0, Lhp4;->Z:I

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Lbt;->c()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    :goto_0
    iget v0, p0, Lhp4;->X:I

    .line 2
    .line 3
    iget-object v1, p0, Lhp4;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lip4;

    .line 6
    .line 7
    iget v2, v1, Lip4;->h0:I

    .line 8
    .line 9
    if-ge v0, v2, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, Lip4;->Z:[I

    .line 12
    .line 13
    aget v1, v1, v0

    .line 14
    .line 15
    if-gez v1, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    iput v0, p0, Lhp4;->X:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lhp4;->X:I

    .line 2
    .line 3
    iget-object p0, p0, Lhp4;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lip4;

    .line 6
    .line 7
    iget p0, p0, Lip4;->h0:I

    .line 8
    .line 9
    if-ge v0, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lhp4;->f0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lip4;

    .line 4
    .line 5
    invoke-virtual {p0}, Lhp4;->b()V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lhp4;->Y:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lip4;->c()V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lhp4;->Y:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lip4;->n(I)V

    .line 19
    .line 20
    .line 21
    iput v2, p0, Lhp4;->Y:I

    .line 22
    .line 23
    iget v0, v0, Lip4;->j0:I

    .line 24
    .line 25
    iput v0, p0, Lhp4;->Z:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string p0, "Call next() before removing element from the iterator."

    .line 29
    .line 30
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
