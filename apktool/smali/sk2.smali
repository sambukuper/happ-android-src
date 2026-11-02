.class public final synthetic Lsk2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ld41;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/appcompat/app/AppCompatActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/AppCompatActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lsk2;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lsk2;->b:Landroidx/appcompat/app/AppCompatActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lsk2;->a:B

    .line 2
    .line 3
    iget-object p0, p0, Lsk2;->b:Landroidx/appcompat/app/AppCompatActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroid/content/Intent;

    .line 9
    .line 10
    sget p1, Landroidx/fragment/app/FragmentActivity;->D0:I

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->y0:Lvk1;

    .line 13
    .line 14
    invoke-virtual {p0}, Lvk1;->E()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p1, Landroid/content/res/Configuration;

    .line 19
    .line 20
    sget p1, Landroidx/fragment/app/FragmentActivity;->D0:I

    .line 21
    .line 22
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->y0:Lvk1;

    .line 23
    .line 24
    invoke-virtual {p0}, Lvk1;->E()V

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
