.class public final synthetic Llo1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lmo1;


# direct methods
.method public synthetic constructor <init>(Lmo1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Llo1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Llo1;->Y:Lmo1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-byte p1, p0, Llo1;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Llo1;->Y:Lmo1;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lmo1;->F1:Ldn2;

    .line 9
    .line 10
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, Lmo1;->E1:Ldn2;

    .line 15
    .line 16
    invoke-interface {p1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1, p1}, Lsn1;->R(ZZ)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
