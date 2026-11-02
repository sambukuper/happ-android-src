.class public final Llf8;
.super Lkf8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic g0:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Llf8;->g0:B

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkf8;-><init>(B)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Llf8;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lkf8;->f0:I

    .line 8
    .line 9
    add-int/lit8 v2, v0, 0x2

    .line 10
    .line 11
    iput v2, p0, Lkf8;->f0:I

    .line 12
    .line 13
    iget-object p0, p0, Lkf8;->Y:[Ljava/lang/Object;

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    aget-object p0, p0, v0

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget v0, p0, Lkf8;->f0:I

    .line 20
    .line 21
    add-int/lit8 v1, v0, 0x2

    .line 22
    .line 23
    iput v1, p0, Lkf8;->f0:I

    .line 24
    .line 25
    iget-object p0, p0, Lkf8;->Y:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object p0, p0, v0

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    iget v0, p0, Lkf8;->f0:I

    .line 31
    .line 32
    add-int/lit8 v2, v0, 0x2

    .line 33
    .line 34
    iput v2, p0, Lkf8;->f0:I

    .line 35
    .line 36
    new-instance v2, Lmp4;

    .line 37
    .line 38
    iget-object p0, p0, Lkf8;->Y:[Ljava/lang/Object;

    .line 39
    .line 40
    aget-object v3, p0, v0

    .line 41
    .line 42
    add-int/2addr v0, v1

    .line 43
    aget-object p0, p0, v0

    .line 44
    .line 45
    invoke-direct {v2, v3, p0, v1}, Lmp4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
