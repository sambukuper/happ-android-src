.class public final Lh02;
.super Luf5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic k0:B


# direct methods
.method public constructor <init>(Lvx4;Lfk2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lh02;->k0:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2}, Luf5;-><init>(Lvx4;Lfk2;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-direct {p0, p1, p2}, Luf5;-><init>(Lvx4;Lfk2;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final K()Let4;
    .locals 1

    .line 1
    iget-byte p0, p0, Lh02;->k0:B

    .line 2
    .line 3
    sget-object v0, Ldt4;->b:Ldt4;

    .line 4
    .line 5
    return-object v0
.end method
