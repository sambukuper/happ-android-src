.class public final Lcm2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:I

.field public b:Lqk2;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Lo84;

.field public i:Lo84;


# direct methods
.method public constructor <init>(ILqk2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcm2;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcm2;->b:Lqk2;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcm2;->c:Z

    .line 10
    .line 11
    sget-object p1, Lo84;->g0:Lo84;

    .line 12
    .line 13
    iput-object p1, p0, Lcm2;->h:Lo84;

    .line 14
    .line 15
    iput-object p1, p0, Lcm2;->i:Lo84;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(ILqk2;I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Lcm2;->a:I

    .line 20
    iput-object p2, p0, Lcm2;->b:Lqk2;

    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lcm2;->c:Z

    .line 22
    sget-object p1, Lo84;->g0:Lo84;

    iput-object p1, p0, Lcm2;->h:Lo84;

    .line 23
    iput-object p1, p0, Lcm2;->i:Lo84;

    return-void
.end method
