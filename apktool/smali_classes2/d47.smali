.class public final synthetic Ld47;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lyv7;


# direct methods
.method public synthetic constructor <init>(Lyv7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ld47;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ld47;->Y:Lyv7;

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
    iget-byte p1, p0, Ld47;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ld47;->Y:Lyv7;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyv7;->u:Lc6;

    .line 9
    .line 10
    iget-object p0, p0, Lc6;->f0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, Lyv7;->u:Lc6;

    .line 19
    .line 20
    iget-object p0, p0, Lc6;->n0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
