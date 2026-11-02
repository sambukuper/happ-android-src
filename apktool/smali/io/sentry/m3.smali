.class public final Lio/sentry/m3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/r1;


# static fields
.field public static final b:Lio/sentry/m3;


# instance fields
.field public final synthetic a:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/m3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lio/sentry/m3;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lio/sentry/m3;->b:Lio/sentry/m3;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lio/sentry/m3;->a:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/n7;Lio/sentry/o4;Lio/sentry/o7;Lio/sentry/o;)Lio/sentry/s1;
    .locals 0

    .line 1
    iget-byte p0, p0, Lio/sentry/m3;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Lio/sentry/b7;

    .line 7
    .line 8
    invoke-direct {p0, p1, p2, p3, p4}, Lio/sentry/b7;-><init>(Lio/sentry/n7;Lio/sentry/o4;Lio/sentry/o7;Lio/sentry/o;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_0
    sget-object p0, Lio/sentry/n3;->a:Lio/sentry/n3;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
