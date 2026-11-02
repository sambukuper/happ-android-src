.class public final synthetic Lgn5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lqi3;

.field public final synthetic Z:Lin5;


# direct methods
.method public synthetic constructor <init>(Lqi3;Lin5;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lgn5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lgn5;->Y:Lqi3;

    .line 4
    .line 5
    iput-object p2, p0, Lgn5;->Z:Lin5;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Lgn5;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lgn5;->Z:Lin5;

    .line 6
    .line 7
    iget-object p0, p0, Lgn5;->Y:Lqi3;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lqi3;->g0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    iget-object v0, v2, Lin5;->d:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    iget-object p0, p0, Lqi3;->g0:Landroidx/appcompat/widget/AppCompatImageView;

    .line 21
    .line 22
    iget-object v0, v2, Lin5;->d:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
