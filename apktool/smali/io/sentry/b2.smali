.class public final synthetic Lio/sentry/b2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/e2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lio/sentry/m2;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/k2;Lio/sentry/m2;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-byte p1, p0, Lio/sentry/b2;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lio/sentry/b2;->Y:Lio/sentry/m2;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/m2;B)V
    .locals 0

    .line 10
    iput-byte p2, p0, Lio/sentry/b2;->X:B

    iput-object p1, p0, Lio/sentry/b2;->Y:Lio/sentry/m2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lio/sentry/b2;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/b2;->Y:Lio/sentry/m2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/sentry/m2;->m()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/m2;->nextDouble()D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    double-to-int p0, v0

    .line 22
    int-to-double v2, p0

    .line 23
    cmpl-double v2, v2, v0

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    return-object p0

    .line 37
    :pswitch_1
    invoke-virtual {p0}, Lio/sentry/m2;->r()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
