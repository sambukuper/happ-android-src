.class public final synthetic Lth3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lvh3;


# direct methods
.method public synthetic constructor <init>(Lvh3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lth3;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lth3;->Y:Lvh3;

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
    .locals 1

    .line 1
    iget-byte p1, p0, Lth3;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Lth3;->Y:Lvh3;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p1, Lvh3;->z1:Lm51;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v0}, Lsn1;->R(ZZ)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    sget-object p1, Lvh3;->z1:Lm51;

    .line 16
    .line 17
    invoke-virtual {p0, v0, v0}, Lsn1;->R(ZZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    sget-object p1, Lvh3;->z1:Lm51;

    .line 22
    .line 23
    invoke-virtual {p0, v0, v0}, Lsn1;->R(ZZ)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
