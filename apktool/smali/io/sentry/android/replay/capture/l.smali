.class public final Lio/sentry/android/replay/capture/l;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic Y:B

.field public final synthetic Z:Lio/sentry/android/replay/capture/m;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/m;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lio/sentry/android/replay/capture/l;->Y:B

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/android/replay/capture/l;->Z:Lio/sentry/android/replay/capture/m;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lio/sentry/android/replay/capture/l;->Y:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/android/replay/capture/l;->Z:Lio/sentry/android/replay/capture/m;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lio/sentry/android/replay/capture/k;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, Lio/sentry/android/replay/capture/i;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p1, Lio/sentry/android/replay/capture/i;

    .line 20
    .line 21
    iget-object v0, p0, Lio/sentry/android/replay/capture/m;->w:Lio/sentry/i1;

    .line 22
    .line 23
    invoke-static {p1, v0}, Lio/sentry/android/replay/capture/i;->a(Lio/sentry/android/replay/capture/i;Lio/sentry/i1;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->e()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    add-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/c;->k(I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-object v1

    .line 36
    :pswitch_0
    check-cast p1, Lio/sentry/android/replay/capture/k;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    instance-of v0, p1, Lio/sentry/android/replay/capture/i;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    check-cast p1, Lio/sentry/android/replay/capture/i;

    .line 46
    .line 47
    iget-object v0, p0, Lio/sentry/android/replay/capture/m;->w:Lio/sentry/i1;

    .line 48
    .line 49
    invoke-static {p1, v0}, Lio/sentry/android/replay/capture/i;->a(Lio/sentry/android/replay/capture/i;Lio/sentry/i1;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->e()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lio/sentry/android/replay/capture/c;->k(I)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p1, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/u6;

    .line 62
    .line 63
    iget-object p1, p1, Lio/sentry/u6;->w0:Ljava/util/Date;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/capture/c;->m(Ljava/util/Date;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-object v1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
