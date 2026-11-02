.class public final Lde0;
.super Lee0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Field;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lde0;->f:B

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lee0;-><init>(Ljava/lang/reflect/Field;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public f([Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lde0;->f:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lne0;->f([Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    array-length v0, p1

    .line 11
    invoke-virtual {p0, v0}, Lne0;->e(I)V

    .line 12
    .line 13
    .line 14
    array-length v0, p1

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    aget-object p1, p1, v0

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, p1}, Lne0;->g(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
