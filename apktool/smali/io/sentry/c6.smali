.class public final synthetic Lio/sentry/c6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/util/f;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lio/sentry/s6;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/s6;B)V
    .locals 0

    .line 10
    iput-byte p2, p0, Lio/sentry/c6;->X:B

    iput-object p1, p0, Lio/sentry/c6;->Y:Lio/sentry/s6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/util/h;Lio/sentry/s6;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    iput-byte p1, p0, Lio/sentry/c6;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lio/sentry/c6;->Y:Lio/sentry/s6;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Lio/sentry/c6;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/c6;->Y:Lio/sentry/s6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "androidx.core.view.ScrollingView"

    .line 9
    .line 10
    invoke-static {p0, v0}, Lio/sentry/util/h;->b(Lio/sentry/s6;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/s6;->b()Lio/sentry/g0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    new-instance v0, Lio/sentry/o2;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lio/sentry/o2;-><init>(Lio/sentry/s6;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    invoke-virtual {p0}, Lio/sentry/s6;->a()Lio/sentry/f0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
