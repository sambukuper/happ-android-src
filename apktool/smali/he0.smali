.class public final Lhe0;
.super Lie0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Field;ZZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lhe0;->g:B

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lie0;-><init>(Ljava/lang/reflect/Field;ZZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public f([Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lhe0;->g:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lie0;->f([Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1}, Lie0;->f([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    array-length v0, p1

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    aget-object p1, p1, v0

    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0, p1}, Lne0;->g(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
