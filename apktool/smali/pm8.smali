.class public final Lpm8;
.super Lqm8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final b:I


# direct methods
.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lpm8;->a:B

    .line 2
    .line 3
    iput p2, p0, Lpm8;->b:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-byte v0, p0, Lpm8;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lpm8;->b:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Lpm8;->b:I

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    iget p0, p0, Lpm8;->b:I

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()C
    .locals 0

    .line 1
    iget-byte p0, p0, Lpm8;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p0, 0x7a

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    const/16 p0, 0x56

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    const/16 p0, 0x76

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
