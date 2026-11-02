.class public final synthetic Ley7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ld41;

.field public final synthetic Z:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Ld41;Landroid/view/Surface;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ley7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ley7;->Y:Ld41;

    .line 4
    .line 5
    iput-object p2, p0, Ley7;->Z:Landroid/view/Surface;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, Ley7;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Ley7;->Z:Landroid/view/Surface;

    .line 4
    .line 5
    iget-object p0, p0, Ley7;->Y:Ld41;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Llz;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    invoke-direct {v0, v2, v1}, Llz;-><init>(ILandroid/view/Surface;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Ld41;->accept(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    new-instance v0, Llz;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v0, v2, v1}, Llz;-><init>(ILandroid/view/Surface;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Ld41;->accept(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    new-instance v0, Llz;

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    invoke-direct {v0, v2, v1}, Llz;-><init>(ILandroid/view/Surface;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, v0}, Ld41;->accept(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
