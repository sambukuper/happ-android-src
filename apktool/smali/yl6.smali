.class public final Lyl6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final X:Lbv0;

.field public Y:Lfb0;

.field public Z:I


# direct methods
.method public constructor <init>(Lzl6;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbv0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lbv0;-><init>(Ljb0;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyl6;->X:Lbv0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lbv0;->a()Lmc4;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lfb0;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lfb0;-><init>(Lmc4;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lyl6;->Y:Lfb0;

    .line 21
    .line 22
    iget p1, p1, Lzl6;->Y:I

    .line 23
    .line 24
    iput p1, p0, Lyl6;->Z:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget p0, p0, Lyl6;->Z:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lyl6;->Y:Lfb0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfb0;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lyl6;->X:Lbv0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lbv0;->a()Lmc4;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lfb0;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lfb0;-><init>(Lmc4;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lyl6;->Y:Lfb0;

    .line 21
    .line 22
    :cond_0
    iget v0, p0, Lyl6;->Z:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    iput v0, p0, Lyl6;->Z:I

    .line 27
    .line 28
    iget-object p0, p0, Lyl6;->Y:Lfb0;

    .line 29
    .line 30
    invoke-virtual {p0}, Lfb0;->a()B

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final remove()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method
