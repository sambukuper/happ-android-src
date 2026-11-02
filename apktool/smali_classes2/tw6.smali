.class public final synthetic Ltw6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/ui/ScannerActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/ui/ScannerActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ltw6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ltw6;->Y:Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Ltw6;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object p0, p0, Ltw6;->Y:Lsu/happ/proxyutility/ui/ScannerActivity;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lsu/happ/proxyutility/ui/ScannerActivity;->S0:Lr6;

    .line 11
    .line 12
    invoke-static {}, Lc4;->g()I

    .line 13
    .line 14
    .line 15
    sget-object v0, Lpz2;->Y:Lpz2;

    .line 16
    .line 17
    invoke-static {}, Lc4;->g()I

    .line 18
    .line 19
    .line 20
    new-instance v2, Lym5;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v3, Lk6;->a:Lk6;

    .line 26
    .line 27
    iput-object v3, v2, Lym5;->a:Lm6;

    .line 28
    .line 29
    invoke-static {}, Lc4;->g()I

    .line 30
    .line 31
    .line 32
    sget-object v3, Ll6;->a:Ll6;

    .line 33
    .line 34
    iput-object v3, v2, Lym5;->a:Lm6;

    .line 35
    .line 36
    iput-object v0, v2, Lym5;->b:Lpz2;

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Lr6;->h0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_0
    sget v0, Lsu/happ/proxyutility/ui/ScannerActivity;->T0:I

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
