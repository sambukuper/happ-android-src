.class public final Lv73;
.super Lwg1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic n:B

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Surface;Landroid/util/Size;I)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lv73;->n:B

    .line 12
    invoke-direct {p0, p3, p2}, Lwg1;-><init>(ILandroid/util/Size;)V

    .line 13
    iput-object p1, p0, Lv73;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lhy7;Landroid/util/Size;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lv73;->n:B

    .line 3
    .line 4
    iput-object p1, p0, Lv73;->o:Ljava/lang/Object;

    .line 5
    .line 6
    const/16 p1, 0x22

    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lwg1;-><init>(ILandroid/util/Size;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f()Lxb4;
    .locals 1

    .line 1
    iget-byte v0, p0, Lv73;->n:B

    .line 2
    .line 3
    iget-object p0, p0, Lv73;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lhy7;

    .line 9
    .line 10
    iget-object p0, p0, Lhy7;->f:Lud0;

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p0, Landroid/view/Surface;

    .line 14
    .line 15
    invoke-static {p0}, Lvr3;->H(Ljava/lang/Object;)Lu73;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
